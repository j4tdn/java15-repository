package inheritance;

/*
 * Book: id, name, price, publisher
 * ReferenceBook: Book(id, name, price, publisher, + tax)
 * */

public class ReferenceBook extends Book {

	private double tax;

	public ReferenceBook() {
	}

	public ReferenceBook(String id, String name, double price, String publisher, String tax) {
		super(id, name, price, publisher);
	}
	
	
}
