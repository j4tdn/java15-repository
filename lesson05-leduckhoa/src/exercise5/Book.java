package exercise5;

public class Book {
	private double price;
	private String publisher;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(double price, String publisher) {
		super();
		this.price = price;
		this.publisher = publisher;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getBookId() {
		return "";
	}
	@Override
	public String toString() {
		return "Book [price=" + price + ", publisher=" + publisher + "]";
	}
	
}
