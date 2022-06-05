package library;

public class OrderUtils2 {
	private OrderUtils2() {
		// TODO Auto-generated constructor stub
	}

	public static void findBookPrice(Book[] book) {
		for (int i = 0; i < book.length; i++) {
			if (book[i].getPrice() < 50000) {
				System.out.println("The id of books whose price is less than 500000.0 is " + book[i].getId());
			}
		}
	}
}
