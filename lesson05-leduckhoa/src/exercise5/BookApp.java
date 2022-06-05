package exercise5;

import java.util.Arrays;

public class BookApp {
	public static void main(String[] args) {
		Book sgk1= new Textbook("SGK01",46.4d,"Nhi Đồng","mới");
		Book sgk2= new Textbook("SGK02",433.8d,"Nhi Đồng","mới");
		Book sgk3= new Textbook("SGK03",98.3d,"Nam Phương","mới");
		
		Book stk1= new Referencebook("STK01",242.3d,"Quốc Hà",2.2d);
		Book stk2= new Referencebook("STK02",49.3d,"Nhi Đồng",3.1d);
		Book[] books= {sgk1,sgk2,sgk3,stk1,stk2};
		
	}

	private static Book[] getPushlisherIsNhiDong(Book[]books) {
		Book[] rs= new Book[books.length];
		int c=0;
		for(int i = 0; i< books.length;i++) {
			if(books[i].getPublisher().equals("Nhi Đồng")) {
				rs[c++]=books[i];
			}
		}
		return Arrays.copyOfRange(rs,0,c);
	}
	
}
