package ex04.bean;

public class ReferBook extends Book{
	private double tax;
	public ReferBook(String id, double cost, String publisher, double tax) {
		super("STK"+id, cost, publisher);
		this.setTax(tax);
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	@Override
	public String toString() {
		return super.getId() + " - " + super.getCost() + " - "  + super.getPublisher() + " - " + this.getTax() ;
	}

	
}
