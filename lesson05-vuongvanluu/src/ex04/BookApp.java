package ex04;

public class BookApp {
	public static void main(String[] args) {
		Book sgk1 = new SgkBook("SGK01", 35, "kim dong", "moi");
		Book sgk2 = new SgkBook("SGK02", 45, "nhi dong", "moi");
		Book sgk3 = new SgkBook("SGK03", 120, "hong phong", "cu");
		Book stk1 = new StkBook("STK01", 250, "nhi dong", 3);
		Book stk2 = new StkBook("STK02", 150, "nhi dong", 4);
		Book[] books = { sgk1, sgk2, sgk3, stk1, stk2 };
		findBook(books);
		System.out.println("==============================");
		findBook1(books);
		System.out.println("==============================");
		findSgkBook(books);
		
	}
	private static void findBook(Book[] a) {
		for(Book book : a) {
			if(book.getPublisher()=="nhi dong") {
				System.out.println(book);
			}
		}
	}
	private static void findBook1(Book[] a) {
		for(Book book : a) {
			if(book.getPrice()< 50) {
				System.out.println(book);
			}
		}
	}
	private static void findSgkBook(Book[] a) {
		for(Book book : a) {
			if(book instanceof SgkBook) {
				if(book.getPrice()>=100 && book.getPrice()<=200) {
					System.out.println(book);
				}
			}
		}
	}

}
