package ro.ase.cts.flyweight.program;

import ro.acs.cts.flyweight.classes.FabricaRezervari;
import ro.acs.cts.flyweight.classes.Rezervare;

public class Program {

	public static void main(String[] args) {
		Rezervare rezervare1 = new Rezervare(1,3,"12.00");
		Rezervare rezervare2 = new Rezervare(5,6,"11.00");

		FabricaRezervari fabrica = new FabricaRezervari();
		fabrica.getClient("alisa@gmail.com").afisareInformatii(rezervare1);
		fabrica.getClient("alisa@gmail.com").afisareInformatii(rezervare2);
		Rezervare rezervare3 = new Rezervare(2,3,"10.00");
		fabrica.getClient("email").afisareInformatii(rezervare3);
	}

}
