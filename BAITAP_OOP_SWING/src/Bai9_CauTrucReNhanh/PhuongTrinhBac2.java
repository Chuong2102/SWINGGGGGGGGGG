package Bai9_CauTrucReNhanh;

public class PhuongTrinhBac2 implements PhuongTrinhInterface{

	double a;
	double b;
	double c;
	double x1;
	double x2;
	String ketQua;
	
	public PhuongTrinhBac2() {
		
	}
	
	
	public PhuongTrinhBac2(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}


	@Override
	public void giaiPhuongTrinh() {
		// TODO Auto-generated method stub
		if(a == 0) {
			PhuongTrinhBac1 ptb1 = new PhuongTrinhBac1(b,c);
			ptb1.giaiPhuongTrinh();
			ketQua = ptb1.getKetQua();
		}
		else {
			double delta = b*b - 4*a*c;
			
			if(delta < 0) {
				ketQua = "Phuong trinh bac 2 vo nghiem";
			}
			else if(delta == 0) {
				x1 = -b/(2*a);
				ketQua = "Phuong trinh bac 2 co nghiem kep: " + x1;
			}
			else if(delta > 0){
				x1 = (-b + Math.sqrt(delta))/(2*a);
				x2 = (-b - Math.sqrt(delta))/(2*a);
				ketQua = "Phuong trinh co 2 nghiem phan biet: x1 = " + x1 + " va x2 = " + x2;
			}
		}
	}
	
	@Override
	public String toString() {
		if(ketQua == null || ketQua.isEmpty())
		{
			giaiPhuongTrinh();
		}
		
		return ketQua;
	}

}
