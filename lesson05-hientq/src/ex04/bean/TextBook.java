package ex04.bean;

public class TextBook extends Book{
	private String status;
	public TextBook(String id, double cost, String publisher, String status) {
		super("SGK"+id, cost, publisher);
		this.setStatus(status);
		
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return super.getId() + " - " + super.getCost() + " - "  + super.getPublisher() + " - " + this.getStatus() ;
	}
	
}
