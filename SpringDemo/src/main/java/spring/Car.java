package spring;

class Car {
 int id;
 String brand;
 double price;
Engine e;
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
public Engine getE() {
	return e;
}
public void setE(Engine e) {
	this.e = e;
}
public void dispCar()
{
	System.out.println(id);
	System.out.println(brand);
	System.out.println(price);
	}
}
