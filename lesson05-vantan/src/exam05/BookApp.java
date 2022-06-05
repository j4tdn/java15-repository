package exam05;

public class BookApp {
	public static void main(String[] args) {
		Book book1 = new TextBook("SGK1", 20, "NHI ĐỒNG", State.NEW);
		Book book2 = new TextBook("SGK2", 13, "BẢO YÊN", State.OLD);
		Book book3 = new TextBook("SGK3", 40, "PHƯƠNG NAM", State.NEW);
		Book book4 = new ReferBook("STK1", 45, "LƯƠNG SƠN", 4);
		Book book5 = new ReferBook("STK2", 56, "DAVID", 5);
		
		Book[] books = {book1, book2, book3, book4, book5};
		
		for (Book book : books) {
			if(book.getPrice() < 50) {
				System.out.print(book + " ");
			}
		}
		
	}
}
