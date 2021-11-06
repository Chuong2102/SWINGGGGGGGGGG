package Bai14_SapXepMang1Chieu_P2;

public class Product {
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	String name;
	double price;
	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	
	
}
