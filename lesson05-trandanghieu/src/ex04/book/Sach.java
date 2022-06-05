package ex04.book;
//Mã sách, đơn giá, nhà xuất bản,
public class Sach {
	private String MaSach;
	private float DonGia;
	private String NhaXuatBan;
	
	public Sach() {
	}

	public Sach(String maSach, float donGia, String nhaXuatBan) {
		MaSach = maSach;
		DonGia = donGia;
		NhaXuatBan = nhaXuatBan;
	}

	public String getMaSach() {
		return MaSach;
	}

	public void setMaSach(String maSach) {
		MaSach = maSach;
	}

	public float getDonGia() {
		return DonGia;
	}

	public void setDonGia(float donGia) {
		DonGia = donGia;
	}

	public String getNhaXuatBan() {
		return NhaXuatBan;
	}

	public void setNhaXuatBan(String nhaXuatBan) {
		NhaXuatBan = nhaXuatBan;
	}

	@Override
	public String toString() {
		return "Sach [MaSach=" + MaSach + ", DonGia=" + DonGia + ", NhaXuatBan=" + NhaXuatBan + "]";
	}
	
	
	

}
