package exercise5;

public class ReferenceBook {
	private String id;
	private double price;
	private String author;
	private double tax;
	
	public ReferenceBook() {

	}

	public ReferenceBook(String id, double price, String author, double tax) {
		this.id = id;
		this.price = price;
		this.author = author;
		this.tax = tax;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "ReferenceBook [id=" + id + ", price=" + price + ", author=" + author + ", tax=" + tax + "]";
	}
	
	
	
}
