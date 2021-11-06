package Bai9_CauTrucReNhanh;

public class PhuongTrinhBac1 implements PhuongTrinhInterface {
	double a;
	double b;
	double nghiemX;
	String ketQua;
	
	public PhuongTrinhBac1() {
		
	}

	public PhuongTrinhBac1(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	
	public double getNghiemX() {
		return nghiemX;
	}

	public void setNghiemX(double nghiemX) {
		this.nghiemX = nghiemX;
	}

	public String getKetQua() {
		return ketQua;
	}

	public void setKetQua(String ketQua) {
		this.ketQua = ketQua;
	}

	@Override
	public void giaiPhuongTrinh() {
		// TODO Auto-generated method stub
		if(a != 0) {
			nghiemX = -b/a;
			ketQua = "Phuong trinh bac 1 co nghiem la: " + nghiemX;
		}
		else {
			if(b != 0) {
				ketQua = "Phuong trinh bac 1 vo nghiem ";
			}
			else {
				ketQua = "Phuong trinh bac 1 co vo so nghiem";
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
