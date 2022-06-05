package ex04.app;

import ex04.bean.Book;
import ex04.bean.Customer;
import ex04.bean.ReferBook;
import ex04.bean.TextBook;

public class BookStoreApp {
	
	public static void listAllBookFromPublisher(Book[] storageBook, String publisher) {
		
		for(Book book : storageBook) {
			if(publisher.equalsIgnoreCase(book.getPublisher())) {
				if(book instanceof TextBook) {
					System.out.println((TextBook)book);
				} else {
					System.out.println((ReferBook)book);
				}
			}
		}
	}
	
	public static void listAllBookWithLowerCost(Book[] storageBook, double cost) {
		for(Book book : storageBook) {
			if(book.getCost() < cost) {
				if(book instanceof TextBook) {
					System.out.println((TextBook)book);
				} else {
					System.out.println((ReferBook)book);
				}
			}
		}
	}
	public static void main(String[] args) {
		// Data khach hang
		Customer kh1 = new Customer("KH001", "Hien", "0909123134", "Da Nang");
		Customer kh2 = new Customer("KH002", "Dung", "0909135345", "Quang Nam");
		
		// Data Textbook
		Book tb1 = new TextBook("001", 400, "Nhi Dong", "new");
		Book tb2 = new TextBook("002", 4400, "Nhi Dong", "old");
		Book tb3 = new TextBook("003", 500, "Quyet Thang", "new");
		
		// Data Reference book
		Book rb1 = new ReferBook("001", 49, "Nha Nam", 10);
		Book rb2 = new ReferBook("002", 4600, "Nhi dong", 5);
		
		// Book storage
		Book[] storageBook = {tb1, tb2, tb3, rb1, rb2};
		System.out.println("-----Books with publisher is Nhi Dong------");
		listAllBookFromPublisher(storageBook, "Nhi Dong");
		System.out.println("-----Books with cost is lower than 50------");
		listAllBookWithLowerCost(storageBook, 50);
		
	}
}
