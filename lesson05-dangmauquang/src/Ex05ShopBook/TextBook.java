package Ex05ShopBook;

public class TextBook extends Book {
	private Status status;
	
	public TextBook() {
	}

	public TextBook(String id, double price, String publisher, Status status) {
		super(id, price, publisher);
		this.status = status;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "TextBook [status=" + status + ", toString()=" + super.toString() + "]";
	}
	
}
