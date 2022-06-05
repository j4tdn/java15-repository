package Bai4;

public class Textbook extends Book {
	private boolean status;
	
	public Textbook() {
		
	}
	
	public Textbook(int idBook, double unitPrice, String namePublisher , boolean status) {
		super(idBook,unitPrice,namePublisher);
		this.status=status;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}
