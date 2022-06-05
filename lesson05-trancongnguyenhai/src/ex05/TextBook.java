package ex05;

public class TextBook extends Book {
	private Boolean status;

	public TextBook() {
	}

	public TextBook(String idBook, double price, String publisher, Boolean status) {
		super(idBook, price, publisher);
		this.status = status;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	
	
	

	
}
