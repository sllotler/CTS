package ro.acs.cts.classes;

public class Item implements IOptiuniMeniu{

	
	private String numeItem;

	public Item(String numeItem) {
		super();
		this.numeItem = numeItem;
	}

	@Override
	public void adaugaNod(IOptiuniMeniu sectiune) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("Exceptie");
	}

	@Override
	public void stergeNod(IOptiuniMeniu optiune) {
		// TODO Auto-generated method stub
		throw new IllegalArgumentException("Exceptie");
	}

	@Override
	public IOptiuniMeniu getNod(int index) {
		// TODO Auto-generated method stub
		throw new IllegalArgumentException("Exceptie");
	}

	@Override
	public void descriere() {
		// TODO Auto-generated method stub
		System.out.println("Item: "+ numeItem);
	}
	
	
}
