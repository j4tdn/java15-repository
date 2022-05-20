package baitap;

public class Vehicle {
	private String tenChuXe;
	private String loaiXe;
	private int dungTich;
	private double giaTri;
	private double thue;

	public Vehicle(String tenChuXe, String loaiXe, int dungTich, double giaTri) {
		super();
		this.tenChuXe = tenChuXe;
		this.loaiXe = loaiXe;
		this.dungTich = dungTich;
		this.giaTri = giaTri;
	}

	public String getTenChuXe() {
		return tenChuXe;
	}

	public void setTenChuXe(String tenChuXe) {
		this.tenChuXe = tenChuXe;
	}

	public String getLoaiXe() {
		return loaiXe;
	}

	public void setLoaiXe(String loaiXe) {
		this.loaiXe = loaiXe;
	}

	public int getDungTich() {
		return dungTich;
	}

	public void setDungTich(int dungTich) {
		this.dungTich = dungTich;
	}

	public double getGiaTri() {
		return giaTri;
	}

	public void setGiaTri(double giaTri) {
		this.giaTri = giaTri;
	}
	


	
	

	@Override
	public String toString() {
		return "Vehicle [tenChuXe=" + tenChuXe + ", loaiXe=" + loaiXe + ", dungTich=" + dungTich + ", giaTri=" + giaTri
				+ ", thue=" + thueVT() + "]";
	}

	public double thueVT() {
		if (dungTich < 100) {
			thue = giaTri * 0.01;
		} else if (dungTich < 200) {
			thue = giaTri * 0.03;
		} else {
			thue = giaTri * 0.05;
		}
		return thue;
	}

}
