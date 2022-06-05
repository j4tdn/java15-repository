package library;

public class OrderUtils {
	private OrderUtils() {
		// TODO Auto-generated constructor stub
	}

	public static void findPublisher(Book[] book) {
		for (int i = 0; i < book.length; i++) {
			if (book[i].getPublisher().equals("Nhi Đồng")) {
				System.out.println("The id of publisher whose name is Nhi Đồng are " + book[i].getId() + i);
			}
		}

	}
}
