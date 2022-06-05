package ex04;

public class StkBook extends Book {
	private double tax;

	public StkBook() {
	}

	public StkBook(String bookCode, double price, String publisher, double tax) {
		super(bookCode, price, publisher);
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
		return "StkBook [tax=" + tax + ", toString()=" + super.toString() + "]";
	}
	
}
