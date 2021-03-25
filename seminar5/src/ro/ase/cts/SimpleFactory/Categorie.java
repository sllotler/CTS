package ro.ase.cts.SimpleFactory;

public abstract class Categorie {
	float pretDeBaza;

	public Categorie(float pretDeBaza) {
		super();
		this.pretDeBaza = pretDeBaza;
	}

	public float getPretDeBaza() {
		return pretDeBaza;
	}
	
	
}
