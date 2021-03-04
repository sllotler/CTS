package ro.ase.cts.readere;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.classes.Aplicant;

public abstract class AplicantReader {

	private String fileName;
	
	public abstract List<Aplicant> citesteAplicanti() throws FileNotFoundException;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public AplicantReader(String fileName) {
		super();
		this.fileName = fileName;
	}

	
}
