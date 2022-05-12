package ls90;

public class Test {
	public static void main(String[] args) {
		SinhVien sv1= new SinhVien(1234, "Nguyễn ngọc a", "k98", 9.8);
		SinhVien sv2 = new SinhVien(1324, "Nguyễn công a", "k78", 7.6);
		
		System.out.println(sv1.compareTo(sv2));
	}

}
