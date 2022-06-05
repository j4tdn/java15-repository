package exercise5;

public class TextBook {
	private String id;
	private double price;
	private String author;
	private String status;
	
	public TextBook() {

	}

	public TextBook(String id, double price, String author, String status) {
		this.id = id;
		this.price = price;
		this.author = author;
		this.status = status;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "TextBook [id=" + id + ", price=" + price + ", author=" + author + ", status=" + status + "]";
	}
	
	
	
}
