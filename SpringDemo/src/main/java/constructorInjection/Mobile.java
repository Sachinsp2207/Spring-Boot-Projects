package constructorInjection;

public class Mobile {
	int id;
	String brand;
	String model;
	double price;
	Sim s;
	
	
	public Mobile(int id, String brand, String model, double price, Sim s) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.s = s;
	}


	public void dispMob()
	{
		System.out.println("-----------Mobile Information---------------");
		System.out.println(id);
		System.out.println(brand);
		System.out.println(model);
		System.out.println(price);
		System.out.println("Mobile Created..!!");
	}
}
