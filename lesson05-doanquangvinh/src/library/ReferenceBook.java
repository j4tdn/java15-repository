package library;

public class ReferenceBook extends Book {
	private double tax;

	public ReferenceBook() {
		// TODO Auto-generated constructor stub
	}

	public ReferenceBook(String id, Double price, String publisher, double tax) {
		super(id, price, publisher);
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
		return "ReferenceBook [tax=" + tax + ", " + super.toString() + "]";
	}

	
	
	
}
