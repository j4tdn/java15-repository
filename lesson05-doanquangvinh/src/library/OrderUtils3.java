package library;

public class OrderUtils3 {
	private OrderUtils3() {
		// TODO Auto-generated constructor stub
	}
	public static void findRefercenBook(Book[] book) {
		for (int i = 0; i < book.length; i++) {
			if (book[i] instanceof TextBook) {
				TextBook tb = (TextBook)book[i];
				
				if (tb.getPrice() >= 100000.0 && tb.getPrice() < 200000.0) {
					System.out.println(tb.getId() );
				}
			}
		}
	}
}
