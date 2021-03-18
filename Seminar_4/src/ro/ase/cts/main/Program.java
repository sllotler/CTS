package ro.ase.cts.main;

import ro.ase.cts.eager.ClinicaVeterinara;
import ro.ase.cts.eager.ClinicaVeterinaraLazy;
import ro.ase.cts.singleton.ScoalaThreadSafe;

public class Program {

	public static void main(String[] args) {
//		ClinicaVeterinara clinica1= ClinicaVeterinara.getInstance();
//		ClinicaVeterinara clinica2=ClinicaVeterinara.getInstance();
//
//		System.out.println(clinica1);
//		System.out.println(clinica2);
		
//		ClinicaVeterinaraLazy clinica1= ClinicaVeterinaraLazy.getInstance("ClinVet","Str.Independentei",4,4500.45f);
//		ClinicaVeterinaraLazy clinica2=ClinicaVeterinaraLazy.getInstance("VetClin","Str.Libertatii",5,2500.45f);
//
//		System.out.println(clinica1);
//		System.out.println(clinica2);
//		
//		clinica1.setNume("Clinica 1!");
//		clinica2.setNumarMedici(45);
//		
//		System.out.println(clinica1.toString());
//		System.out.println(clinica2.toString());
		
		ScoalaThreadSafe scoala1=ScoalaThreadSafe.getInstanta("Str.Dunarii", 150, 4000.50f);
		ScoalaThreadSafe scoala2=ScoalaThreadSafe.getInstanta("Str.Caraiman", 250, 7000.50f);
		
		System.out.println(scoala1.toString());
		System.out.println(scoala2.toString());
		
		
	}

}
