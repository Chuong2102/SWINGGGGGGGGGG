package Bai13_Mang1Chieu_P2;

import java.util.Date;

public class Manager extends Person{
	public CoffeeShop[] getShops() {
		return shops;
	}

	public void setShops(CoffeeShop[] shops) {
		this.shops = shops;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	@Override
	public String toString() {
		
		String ketqua = super.toString();
		ketqua+= "Manager [shops=" + shops + ", income=" + income + "]";
		return ketqua;
	}

	CoffeeShop[] shops;
	double income;
	
	public Manager(CoffeeShop[] a, double income, String name, int gender, Date birthDay) {
		super(name, gender, birthDay);
		// TODO Auto-generated constructor stub
		this.income = income;
		this.shops = a;
		
	}
	
	
}
