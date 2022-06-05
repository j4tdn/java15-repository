package library;

public class OrderUtils3 {
	private OrderUtils3() {
		// TODO Auto-generated constructor stub
	}
	public static void findRefercenBook(Book[] book) {
		for (int i = 0; i < book.length; i++) {
			if (book[i] instanceof ReferenceBook) {
				ReferenceBook rb = (ReferenceBook)book[i];
				
				if (rb.getPrice() >= 100000.0 && rb.getPrice() < 200000.0) {
					System.out.println(rb.getId() );
				}
			}
		}
	}
}
