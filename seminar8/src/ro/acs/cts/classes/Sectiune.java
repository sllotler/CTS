package ro.acs.cts.classes;
import java.util.ArrayList;
import java.util.List;

public class Sectiune implements IOptiuniMeniu{
	List<IOptiuniMeniu> lista;
	private String nume;
	public Sectiune(String nume) {
		super();
		this.lista = new ArrayList<IOptiuniMeniu>();
		this.nume = nume;
	}
	@Override
	public void adaugaNod(IOptiuniMeniu optiune) {
		lista.add(optiune);
		
	}
	@Override
	public void stergeNod(IOptiuniMeniu optiune) {
		lista.remove(optiune);
		
	}
	@Override
	public IOptiuniMeniu getNod(int index) {
		return lista.get(index);
	}
	@Override
	public void descriere() {
		System.out.println("Sectiunea " + nume + " are urmatoarele subsectiuni:");
		for(IOptiuniMeniu optiune : lista)
			optiune.descriere();		
	}	
}
