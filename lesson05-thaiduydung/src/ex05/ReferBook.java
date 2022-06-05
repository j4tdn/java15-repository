package ex05;

public class ReferBook extends Book {
	private double tax;

	public ReferBook() {
	}

	public ReferBook(String idTB, long price, String placeOfPublication, double tax) {
		super(idTB, price, placeOfPublication);
		this.tax = tax;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	@Override
	public double getCost() {
		return getPrice() * (1 + tax);
	}

	@Override
	public String toString() {
		return super.toString() + "ReferBook [tax=" + tax + "]";
	}
}