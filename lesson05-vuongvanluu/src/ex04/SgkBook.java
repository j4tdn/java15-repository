package ex04;

public class SgkBook extends Book{
	private String status;
	public SgkBook() {
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public SgkBook(String bookCode, double price, String publisher, String status) {
		super(bookCode, price, publisher);
		this.status = status;
	}
	@Override
	public String toString() {
		return "SgkBook [status=" + status + ", toString()=" + super.toString() + "]";
	}
	
}
