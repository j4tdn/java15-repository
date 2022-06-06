package view;

public class Ex04TextBook extends Ex04Book{
	private Status status;
	public Ex04TextBook() {

	}
	public Ex04TextBook(String idBook, String publishingCompany, double price, Status status) {
		super(idBook, publishingCompany, price);
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
		return  super.toString() + " " + status;
	}
	
	
	
	
	
	
	
}
