package Ex05ShopBook;

public class RefrenceBook extends Book {
	private double tax;
	
	public RefrenceBook() {
	}

	public RefrenceBook(String id, double price, String publisher, double tax) {
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
		return "RefrenceBook [tax=" + tax + ", toString()=" + super.toString() + "]";
	}
	
}
