package inheritance;

public class RefrenceBook extends Book {
	
	private double tax;
	
	public RefrenceBook() {
	}

	public RefrenceBook(String id, String name, double price, String publisher, double tax) {
		super(id, name, price, publisher);
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
		return "RefrenceBook [tax=" + tax + ", book = " + super.toString() + "]";
	}



	
}
