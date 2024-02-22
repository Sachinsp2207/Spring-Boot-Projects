package constructorInjection;

public class Marker {
	int id;
	String color;
	double price;
	Marker() {}
	Marker(int id, String color, double price) {
		super();
		this.id = id;
		this.color = color;
		this.price = price;
	}
	public void dispMarker()
	{
		System.out.println("Marker Crated Sucessfully..!!");
		System.out.println(id);
		System.out.println(color);
		System.out.println(price);
		System.out.println("Dhanyavad");
	}
	
	
}
