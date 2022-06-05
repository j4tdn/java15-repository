package ex04.book;



public class BookApp {
	public static void main(String[] args) {
		 SachGiaoKhoa gk1=new SachGiaoKhoa("SGK1",10f,"Giáo Dục","Mới");
		 SachGiaoKhoa gk2=new SachGiaoKhoa("SGK2",20f,"Nhi Đồng","Cũ");
		 SachGiaoKhoa gk3=new SachGiaoKhoa("GK3",70f,"Nhi Đồng","Mới");
		 
		 SachThamKhao tk1= new SachThamKhao("STK1",120f, "Nhi Đồng", 0.1f);
		 SachThamKhao tk2= new SachThamKhao("STK2",150f, "Nhi Đồng", 0.2f);
		 
		 Sach[] sach= {gk1,gk2,gk3,tk1,tk2};
		
		
		
		
	}
	public static Sach[] findNDBook(Sach[] sachs) {
		Sach[] ndBook=new Sach[sachs.length];
		
		int count=0;
		
		for(Sach sach:sachs) {
			if(sach.getNhaXuatBan()=="Nhi Đồng") {
				ndBook[count]=sach;
				count++;
			}
			
		}
		return ndBook;
	}
	public static Sach[] findpriceBook(Sach[] sachs) {
		Sach[] reBook=new Sach[sachs.length];
		
		int count=0;
		
		for(Sach sach:sachs) {
			if(sach.getDonGia()<50) {
				reBook[count]=sach;
				count++;
			}
			
		}
		return reBook;
	}
	public static Sach[] findprice2Book(Sach[] sachs) {
		Sach[] ndBook=new Sach[sachs.length];
		
		int count=0;
		
		for(Sach sach:sachs) {
			if(sach.getNhaXuatBan()=="Nhi Đồng") {
				ndBook[count]=sach;
				count++;
			}
			
		}
		return ndBook;
	}
	
	
	
	
	
	
	
	
	

}
