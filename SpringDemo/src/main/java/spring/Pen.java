package spring;

public class Pen {
 int id;
 String brand;
 double price;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
 public void penDetails()
 {
	 System.out.println(id);
	 System.out.println(brand);
	 System.out.println(price);
 }
}
