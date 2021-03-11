package ro.ase.cts.readere;

import java.io.FileNotFoundException;
import java.util.List;

import java.util.Scanner;

import ro.ase.cts.classes.Aplicant;

public abstract class AplicantReader {
	private String fileName;
	
	public abstract List<Aplicant> citesteAplicanti() throws FileNotFoundException, NumberFormatException;

	public void citesteAplicant(Scanner input, Aplicant aplicant) {
		String nume = input.next();
		String prenume = input.next();
		int varsta = input.nextInt();
		int punctaj = input.nextInt();
		int nr = input.nextInt();
		String[] vect = new String[5];
		for (int i = 0; i < nr; i++)
			vect[i] = input.next();
		
		aplicant.setNume(nume);
		aplicant.setPrenume(prenume);
		aplicant.setVarsta(varsta);
		aplicant.setNumarProiecte(nr, vect);
		aplicant.setPunctaj(punctaj);
	}
	
	public AplicantReader(String fileName) {
		super();
		this.fileName = fileName;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	
}