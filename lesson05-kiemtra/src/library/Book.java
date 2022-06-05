package library;

public class Book {
	private String id;
	private Double price;
	private String publisher;

	
	public Book() {
		// TODO Auto-generated constructor stub
	}


	public Book(String id, Double price, String publisher) {
		super();
		this.id = id;
		this.price = price;
		this.publisher = publisher;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	public String getPublisher() {
		return publisher;
	}


	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}


	@Override
	public String toString() {
		return "Book [id=" + id + ", price=" + price + ", publisher=" + publisher + "]";
	}
	
}
