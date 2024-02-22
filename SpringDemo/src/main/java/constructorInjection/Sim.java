package constructorInjection;

public class Sim {
	int id;
	String network;
	String type;
	public Sim(int id, String network, String type) {
		super();
		this.id = id;
		this.network = network;
		this.type = type;
	}
	
	public void dispSim()
	{
		System.out.println("----------Sim Information---------");
		System.out.println(id);
		System.out.println(network);
		System.out.println(type);
		
	}
	
}
