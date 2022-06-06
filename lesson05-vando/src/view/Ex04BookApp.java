package view;

public class Ex04BookApp {
	public void Total(int ar[]) {
		
	}
	public static void main(String[] args) {
		Ex04TextBook tb1 = new Ex04TextBook("SGK01","Nhi Đồng",50000,Status.NEW);
		Ex04TextBook tb2 = new Ex04TextBook("SGK02","Nhi Đồng",30000,Status.NEW);
		Ex04TextBook tb3 = new Ex04TextBook("SGK03","Hà Nội",169000,Status.OLD);
		Ex04ReferBook rb1 = new Ex04ReferBook("STK01", "Nhi Đồng", 123000,10d);
		Ex04ReferBook rb2 = new Ex04ReferBook("STK02", "Kim Đồng", 25000,10d);
		
		Ex04Book[] books = {tb1, tb2, tb3, rb1, rb2};
			
		System.out.println("Tìm toàn bộ sách thuộc nhà xuất bản Nhi Đồng");
		for(Ex04Book book :books) {
			if(book.getPublishingCompany() == "Nhi Đồng") {
				System.out.println(book);
			}
		}
		System.out.println("===============================");
		System.out.println("Tìm toàn bộ sách có đơn giá nhỏ hơn 50");
		for(Ex04Book book :books) {
			if(book.getPrice() < 50000) {
				System.out.println(book);
			}
		}
		System.out.println("===============================");
		System.out.println("Tìm toàn bộ sách giáo khoa có đơn giá từ 100 đến 200");
		for(Ex04Book book :books) {
			if(book instanceof Ex04TextBook) {
				if(book.getPrice() > 100000 && book.getPrice() < 200000) {
					System.out.println(book);
				}
			}
		}
		
		Ex04Customer ct1 = new Ex04Customer("KH01", "Nguyen Do", "0392219299", "Hue");
		
		Ex04Book[] bookct1 = {tb1, tb3, rb1};
		System.out.println("===============================");
		System.out.println("Tính tổng tiền mà khách hàng phải thanh toán");
		double total = 0;
		for(Ex04Book book :bookct1) {
			if(book instanceof Ex04TextBook) {
				if((((Ex04TextBook) book).getStatus()) == Status.OLD) {
					total += + book.getPrice() * 0.6; 
				}
				if(((Ex04TextBook) book).getStatus() == Status.NEW){
					total += book.getPrice();
				}
			}
			if(book instanceof Ex04ReferBook) {
				total += (book.getPrice() * (1 + 0.01*((Ex04ReferBook) book).getTax()));
			}
		}
		
		System.out.println("Total: " + total);
		
	}
}
