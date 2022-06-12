package inheritance;

public class ReferenceBook extends Book {
    private double tax;
	public ReferenceBook(String name, String bookId, double price, String publisher , double tax) {
		super(name, bookId, price, publisher);
		// TODO Auto-generated constructor stub
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
		return "ReferenceBook [tax=" + tax + ", toString()=" + super.toString() + "]";
	}
	
}
