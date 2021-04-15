package ro.acs.cts.flyweight.classes;

import java.util.HashMap;
import java.util.Map;

public class FabricaRezervari {

	private Map<String, FlyweightAbstract> clienti;

	public FabricaRezervari() {
		super();
		this.clienti = new HashMap<String, FlyweightAbstract>();
	}
	
	public FlyweightAbstract getClient(String email)
	{
		FlyweightAbstract client = clienti.get(email);
		if(client==null)
		{
			client = new Client("Alisa", "0725213867", email);
			client.put(email, client);
		}
		return client;
	}
	
	
}
