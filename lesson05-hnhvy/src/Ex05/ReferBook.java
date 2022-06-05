package Ex05;

public class ReferBook extends Book{
	
	//Sách tham khảo: Mã sách, đơn giá, nhà xuất bản, thuế %.
	private double tax;
	
	public ReferBook() {
	}

	public ReferBook(String bookId, int price, String publishingCompany, double tax) {
		super(bookId, price, publishingCompany);
		this.tax = tax;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	
	
}