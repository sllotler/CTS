package ro.ase.cts.singleton;

public class ScoalaThreadSafe {
	private String adresa;
	private int numarElevi;
	private float buget; 
	
	private static ScoalaThreadSafe instanta=null;
	
	private ScoalaThreadSafe(String adresa,int numarElevi, float buget) {
		this.adresa = adresa;
		this.numarElevi = numarElevi;
		this.buget = buget;
	}
	
	public static synchronized ScoalaThreadSafe getInstanta(String adresa, int numarElevi, float buget) {
		if(instanta == null)
			instanta= new ScoalaThreadSafe(adresa, numarElevi, buget);
		return instanta;
	}

	@Override
	public String toString() {
		return "ScoalaThreadSafe [adresa=" + adresa + ", numarElevi=" + numarElevi + ", buget=" + buget + "]";
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public int getNumarElevi() {
		return numarElevi;
	}

	public void setNumarElevi(int numarElevi) {
		this.numarElevi = numarElevi;
	}

	public float getBuget() {
		return buget;
	}

	public void setBuget(float buget) {
		this.buget = buget;
	}
}
