package view;

public class Ex04ReferBook extends Ex04Book{
	private double tax;
	
	public Ex04ReferBook() {
	}

	public Ex04ReferBook(String idBook, String publishingCompany, double price, double tax) {
		super(idBook, publishingCompany, price);
		this.tax = tax;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return  super.toString() + " " + tax;
	}
	
	
}
