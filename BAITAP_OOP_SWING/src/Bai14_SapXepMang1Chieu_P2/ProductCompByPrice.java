package Bai14_SapXepMang1Chieu_P2;

import java.util.*;

public class ProductCompByPrice implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		double temp = o1.getPrice() - o2.getPrice();
		return (int)temp;
	}
	
}
