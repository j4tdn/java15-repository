package Bai4;

public class Referencebook extends Book{
	private double tax;
	
	public Referencebook() {
		
	}
	public Referencebook(int idBook, double unitPrice, String namePublisher , double tax) {
		super(idBook,unitPrice,namePublisher);
		this.tax = tax;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
}
