package ro.ase.cts.factorymethod.main;

import ro.ase.cts.factorymethod.Categorie;
import ro.ase.cts.factorymethod.FactoryBody;
import ro.ase.cts.factorymethod.FactoryCategorie;
import ro.ase.cts.factorymethod.FactoryDurere;
import ro.ase.cts.factorymethod.FactoryGripa;

public class Program {
	
	public static FactoryCategorie getTipFactory() {
		return new FactoryGripa();
	}
	
	public static void printeazaCategorie(FactoryCategorie factoryCategorie, float pretDeBaza) {
		Categorie categorie = factoryCategorie.createCategorie(pretDeBaza);
		System.out.println(categorie.toString());
	}

	public static void main(String[] args) {
		printeazaCategorie(getTipFactory(), 10);
	}
}
