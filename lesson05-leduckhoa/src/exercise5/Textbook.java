package exercise5;

public class Textbook extends Book{
	private String textBookId;

	private String status;
	public Textbook() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Textbook(String textBookId, double price, String publisher, String status) {
		super();
		this.textBookId = textBookId;
		this.status = status;
	}
	@Override
	public String getBookId() {
		// TODO Auto-generated method stub
		return textBookId;
	}
	public String getTextBookId() {
		return textBookId;
	}
	public void setTextBookId(String textBookId) {
		this.textBookId = textBookId;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "TextBook [textBookId=" + textBookId + ", status=" + status + "]";
	}
	
	
}
