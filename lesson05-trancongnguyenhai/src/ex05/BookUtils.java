package ex05;

public class BookUtils {
	public static Book[] SearchNhiDong(Book[] books) {
		Book[] result = new Book[books.length];
		for (int i = 0; i < books.length; i++) {
			if (books[i].getPublisher() == "Nhi Dong") {
				result[i] = books[i];
			}

		}
		return result;
	}
	
	public static Book[] SearchPriceLeast50(Book[] books) {
		Book[] result = new Book[books.length];
		for (int i = 0; i < books.length; i++) {
			if (books[i].getPrice() < 50) {
				result[i] = books[i];
			}
		}
		return result;
	}

//	public static Book[] SearchTextBookPrice(Book[] books) {
//		Book[] result = new Book[books.length];
//		for (int i = 0; i < books.length; i++) {
//			if (books[i].getPublisher().sp ) {
//				result[i] = books[i];
//			}
//		}
//		return result;
//	}
	
	
	
	
	public static void Show(Book[] books) {
		for (int i = 0; i < books.length; i++) {
			System.out.println(books[i]);
		}
	}

}
