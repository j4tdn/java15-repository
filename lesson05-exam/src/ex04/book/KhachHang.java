package ex04.book;
//Khách hàng: Mã khách hàng, họ tên, số điện thoại, địa chỉ
public class KhachHang {
	private String MaKhachHang;
	private String HoTen;
	private String SDT;
	private String DiaChi;
	public KhachHang() {
		 
	}
	public KhachHang(String maKhachHang, String hoTen, String sDT, String diaChi) {
		MaKhachHang = maKhachHang;
		HoTen = hoTen;
		SDT = sDT;
		DiaChi = diaChi;
	}
	public String getMaKhachHang() {
		return MaKhachHang;
	}
	public void setMaKhachHang(String maKhachHang) {
		MaKhachHang = maKhachHang;
	}
	public String getHoTen() {
		return HoTen;
	}
	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}
	public String getSDT() {
		return SDT;
	}
	public void setSDT(String sDT) {
		SDT = sDT;
	}
	public String getDiaChi() {
		return DiaChi;
	}
	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}
	@Override
	public String toString() {
		return "KhachHang [MaKhachHang=" + MaKhachHang + ", HoTen=" + HoTen + ", SDT=" + SDT + ", DiaChi=" + DiaChi
				+ "]";
	}
	
	

}
