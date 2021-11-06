package Bai13_Mang1Chieu_P2;

public class CoffeeShop {
	@Override
	public String toString() {
		return "CoffeeShop [name=" + name + ", address=" + address + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	String name;
	String address;
	
	public CoffeeShop() {
		super();
	}

	public CoffeeShop(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	
}
