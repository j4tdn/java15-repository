package Kiemtra;

public class Bai5 {
	class KhachHang{
		 public String MaKhachHang;
		 public String Name;
		 public int Number;
		 public String Address;
		 
		 
		 KhachHang(){} // Hàm dựng
		 KhachHang(String mkh, String name, int num, String add){
			this.MaKhachHang = mkh;
			this.Name = name;
			this.Number = num;
			this.Address = add;
		 }

	class SachGiaoKhoa{
		public String MaSach;
		 public int Price;
		 public String NhaXuatBan;
	
		 SachGiaoKhoa(){} // Hàm dựng
		 SachGiaoKhoa(String maSach, int price, String nhaXuatBan){
			this.MaSach = maSach;
			this.Price = price;
			this.NhaXuatBan = nhaXuatBan;
		 }
	}
		
}
