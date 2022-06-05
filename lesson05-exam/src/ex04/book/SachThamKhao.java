package ex04.book;

public class SachThamKhao extends Sach{
	public float Thue;
	public SachThamKhao() {
	}
	public SachThamKhao(String maSach, float donGia, String nhaXuatBan,float Thue) {
		super(maSach, donGia, nhaXuatBan);
		this.Thue=Thue;
	}
	public float getThue() {
		return Thue;
	}
	public void setThue(float thue) {
		Thue = thue;
	}
	@Override
	public String toString() {
		return "SachThamKhao [Thue=" + Thue + ", getMaSach()=" + getMaSach() + ", getDonGia()=" + getDonGia()
				+ ", getNhaXuatBan()=" + getNhaXuatBan() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
	

}
