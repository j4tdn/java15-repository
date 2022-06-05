package kt;

public class Referencebook extends Book{
	private String refBookId;
	private double tax;
	public Referencebook() {
	
	}
	public Referencebook(String refBookId, double price, String publisher, double tax) {
		super();
		this.refBookId = refBookId;
		this.tax = tax;
	}
	@Override
	public String getBookId() {

		return this.refBookId;
	}
	public String getRefBookId() {
		return refBookId;
	}
	public void setRefBookId(String refBookId) {
		this.refBookId = refBookId;
	}
	
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	@Override
	public String toString() {
		return "RefBook [refBookId=" + refBookId + ", tax=" + tax + "]";
	}
	
	
	
}
