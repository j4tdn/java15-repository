package inheritance;

public class Book {
	private String name;
	private String bookId;
	private double price;
	private String publisher;
	public Book(String name, String bookId, double price, String publisher) {
        
		this.name = name;
		this.bookId = bookId;
		this.price = price;
		this.publisher = publisher;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
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

	@Override
	public String toString() {
		return "Book [name=" + name + ", bookId=" + bookId + ", price=" + price + ", publisher=" + publisher + "]";
	}
  
}
