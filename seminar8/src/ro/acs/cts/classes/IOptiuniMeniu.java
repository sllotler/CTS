package ro.acs.cts.classes;

public interface IOptiuniMeniu {
	void adaugaNod(IOptiuniMeniu sectiune) throws Exception;
	void stergeNod(IOptiuniMeniu optiune);
	IOptiuniMeniu getNod(int index);
	void descriere();

}
