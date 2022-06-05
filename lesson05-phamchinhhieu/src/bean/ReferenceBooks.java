package bean;

public class ReferenceBooks {
	String idbook, publisher;
	double price, tax;
	
	public ReferenceBooks() {
		// TODO Auto-generated constructor stub
	}

	public ReferenceBooks(String idbook, String publisher, double price, double tax) {
		super();
		this.idbook = idbook;
		this.publisher = publisher;
		this.price = price;
		this.tax = tax;
	}

	public String getIdbook() {
		return idbook;
	}

	public void setIdbook(String idbook) {
		this.idbook = idbook;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "ReferenceBooks [idbook=" + idbook + ", publisher=" + publisher + ", price=" + price + ", tax=" + tax
				+ "]";
	}
	
}
