package ro.ase.cts.chain.classes;

public class ContCredit extends Cont{

	public ContCredit(float sold, String numeClient, Cont succesor) {
		super(sold, numeClient, succesor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void plateste(float suma) {
		if(super.getSold()>=suma) {
			System.out.println(super.getNumeClient() + " a realizat plata de: "+ suma+ " din contul curent");
		}else {
			super.getSuccesor().plateste(suma);
		}
	}

}
