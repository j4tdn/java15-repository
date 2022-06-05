package ex05;

public class ReferBook extends Book{
	private double tax;
	public ReferBook() {
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public ReferBook(String idBook, double price, String publisher, double tax) {
		super(idBook, price, publisher);
		this.tax = tax;
	}
	
	
}
