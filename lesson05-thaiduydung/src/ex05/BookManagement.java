package ex05;

import java.util.ArrayList;
import java.util.List;

public class BookManagement {
	List<Book> list = new ArrayList<>();

	public void add(Book book) {
		list.add(book);
	}

	public void findByPlaceOfPublication(String pub) {
		for (Book book : list) {
			if (book.getPlaceOfPublication().equalsIgnoreCase(pub)) {
				System.out.println(book);
			}
		}
	}

	public void findByPrice() {
		for (Book book : list) {
			if (book.getPrice() < 50) {
				System.out.println(book);
			}
		}
	}

	public void findByPriceRange() {
		for (Book book : list) {
			if (book.getPrice() < 200 && book.getPrice() > 100) {
				System.out.println(book);
			}
		}
	}

	public double totalOfMoney() {
		double textBook = 0;
		double referBook = 0;
		for (Book book : list) {
			if (book instanceof TextBook) {
				textBook += book.getCost();
			}
			if (book instanceof ReferBook) {
				referBook += book.getCost();
			}
		}
		return textBook + referBook;
	}
}