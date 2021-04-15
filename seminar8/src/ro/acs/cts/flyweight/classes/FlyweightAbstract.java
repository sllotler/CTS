package ro.acs.cts.flyweight.classes;

public interface FlyweightAbstract {

	void afisareInformatii(Rezervare rezervare);

	void put(String email, FlyweightAbstract client);
}
