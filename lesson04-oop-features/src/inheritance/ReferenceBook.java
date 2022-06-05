package inheritance;

public class ReferenceBook extends Book {
	private double tax;
	public ReferenceBook() {
	}
	public ReferenceBook(String id, String name, double price, String publisher, double tax) {
		super(id, name, price, publisher);
		this.tax = tax;
	}
	
	
	
}
