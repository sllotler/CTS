package ro.ase.cts.state.classes;

public class Masa {
	private StareMasa stareMasa;
	private int nrMasa;
	
	public Masa(int nrMasa) {
		super();
		this.nrMasa = nrMasa;
		this.stareMasa= new StareLibera();
	}

	public StareMasa getStareMasa() {
		return stareMasa;
	}

	void setStareMasa(StareMasa stareMasa) {
		this.stareMasa = stareMasa;
	}

	public int getNrMasa() {
		return nrMasa;
	}
	
	public void rezervaMasa() {
		modificaStareMasa(new StareRezervata());
	}
	
	public void ocupaMasa() {
		StareMasa stareOcupata = new StareOcupata();
		stareOcupata.modificaStare(this);
	}
	
	public void elibereazaMasa() {
		StareMasa stareLibera = new StareLibera();
		stareLibera.modificaStare(this);
	}
	
	public void modificaStareMasa(StareMasa stare) {
		stare.modificaStare(this);
	}
}
