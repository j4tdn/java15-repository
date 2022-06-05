package ex04.book;


//Sách giáo khoa: Mã sách, đơn giá, nhà xuất bản, tình trạng (mới, cũ).
public class SachGiaoKhoa extends Sach{
	private String TinhTrang;
	
	public SachGiaoKhoa() {
		
	}

	public SachGiaoKhoa(String maSach, float donGia, String nhaXuatBan, String TinhTrang) {
		super(maSach, donGia, nhaXuatBan);
		this.TinhTrang=TinhTrang;
		// TODO Auto-generated constructor stub
	}

	public String getTinhTrang() {
		return TinhTrang;
	}

	public void setTinhTrang(String tinhTrang) {
		TinhTrang = tinhTrang;
	}

	@Override
	public String toString() {
		return "SachGiaoKhoa [TinhTrang=" + TinhTrang + ", getMaSach()=" + getMaSach() + ", getDonGia()=" + getDonGia()
				+ ", getNhaXuatBan()=" + getNhaXuatBan() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
	
	

	

	

	
	
	
	
	

}
