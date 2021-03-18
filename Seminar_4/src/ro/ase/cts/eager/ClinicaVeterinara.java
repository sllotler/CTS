package ro.ase.cts.eager;

public class ClinicaVeterinara {
	private String nume;
	private String adresa;
	private int numarMedici;
	private float buget;
	
	//La EagerInitialization, instanta este initializata la momentul declararii
	private static final ClinicaVeterinara clinica =new ClinicaVeterinara("Clinica Vet","Str.Dorobanti",5,30000.2f);

	//Constructorul obligatoriu trebuie sa fie PRIVATE
	private ClinicaVeterinara(String nume, String adresa, int numarMedici, float buget) {
		super();
		this.nume = nume;
		this.adresa = adresa;
		this.numarMedici = numarMedici;
		this.buget = buget;
	}
	
	//Functia statica publica care va returna instanta
	public static ClinicaVeterinara getInstance() {
		return clinica;
	}

	@Override
	public String toString() {
		return "ClinicaVeterinara [nume=" + nume + ", adresa=" + adresa + ", numarMedici=" + numarMedici + ", buget="
				+ buget + "]";
	}
	
	
}
