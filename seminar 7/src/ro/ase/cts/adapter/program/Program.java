package ro.ase.cts.adapter.program;

import decorator.AbstractDecorator;
import decorator.Card;
import decorator.ConcretDecorator;
import decorator.ICard;
import ro.ase.cts.adapter.classes.AdapterCreditClase;
import ro.ase.cts.adapter.classes.AdapterCreditObj;
import ro.ase.cts.adapter.classes.InterfataCredit;
import ro.ase.cts.adapter.classes.Leasing;

public class Program {

	public static void oferaInfoCredit(InterfataCredit credit, String nume, float suma) {
		credit.acordaCredit(nume, suma);
	}
	
	public static void main(String[] args) {
		Leasing leasing = new Leasing();
		AdapterCreditObj adapter = new AdapterCreditObj(leasing);
		oferaInfoCredit(adapter,"Ionel",245.50f);

				
		//de clase:
		AdapterCreditClase adapterCredit = new AdapterCreditClase();
		oferaInfoCredit(adapterCredit,"Gigel",322.43f);
		
		ICard card = new Card("Maria");
		card.platesteFizic();
		card.platesteOnline();
		
		AbstractDecorator decoratorContactless = new ConcretDecorator(card);
		decoratorContactless.platesteContactless();
	}

}