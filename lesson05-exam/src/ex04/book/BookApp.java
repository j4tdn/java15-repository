package ex04.book;



public class BookApp {
	public static void main(String[] args) {
		listBook();
		
		
		
	}
	public static void listBook() {
		 SachGiaoKhoa gk1=new SachGiaoKhoa("SGK1",10000f,"Giáo Dục","Mới");
		 SachGiaoKhoa gk2=new SachGiaoKhoa("SGK2",15000f,"Nhi Đồng","Cũ");
		 SachGiaoKhoa gk3=new SachGiaoKhoa("GK3",20000f,"Nhi Đồng","Mới");
		 
		 SachThamKhao tk1= new SachThamKhao("STK1",40000f, "Nhi Đồng", 0.1f);
		 SachThamKhao tk2= new SachThamKhao("STK2",45000f, "Nhi Đồng", 0.1f);
		 
		 Sach[] sach= {gk1,gk2,gk3,tk1,tk2};
		int m=sach.length;
		for(int i=0; i<m;i++) {
			System.out.println(sach[i]);
		}
		 
		 
		 
	}
	

}
