/**
 * 05.KF
 * @author dangmauquang
 */
package Ex05ShopBook;

public class BookApp {
	public static void main(String[] args) {
		TextBook sgk1 = new TextBook("SGK1", 45, "Nhi Đồng", Status.OlD);
		TextBook sgk2 = new TextBook("SGK2", 120, "Nhi Đồng", Status.NEW);
		TextBook sgk3 = new TextBook("SGK3", 48, "Nhân Dân", Status.OlD);

		RefrenceBook stk1 = new RefrenceBook("STK1", 90, "Nhi Đồng", 10d);
		RefrenceBook stk2 = new RefrenceBook("STK1", 120, "Nhân Dân", 20d);

		Book[] books = { sgk1, sgk2, sgk3, stk1, stk2 };
		System.out.println("Sách thuộc nhà xuất bản nhi đồng là: ");
		findBookByPublisher(books);
		System.out.println("===================================================");
		System.out.println("Sách có giá nhỏ hơn 50 là: ");
		findBookByPrice(books);
		System.out.println("===================================================");
		System.out.println("Sách giáo khoa có giá từ 100 đến 200 là: ");
		findBookByPriceAndTextBook(books);

	}

	public static void findBookByPublisher(Book[] books) {
		for (Book book : books) {

			if (book.getPublisher() == "Nhi Đồng") {
				System.out.println(book.toString());
			}
		}

	}

	public static void findBookByPrice(Book[] books) {
		for (Book book : books) {
			if (book.getPrice() < 50) {
				System.out.println(book.toString());
			}
		}

	}

	public static void findBookByPriceAndTextBook(Book[] books) {
		for (Book book : books) {
			if (book instanceof TextBook) {
				TextBook tb = (TextBook) book;
				if (tb.getPrice() < 200 && tb.getPrice() > 100) {
					System.out.println(tb.toString());
				}
			}
		}

	}

}
