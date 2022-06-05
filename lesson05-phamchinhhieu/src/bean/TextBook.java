package bean;

public class TextBook {
	String idBook, publishes, status;
	double price;
	
	public TextBook() {
		// TODO Auto-generated constructor stub
	}

	public TextBook(String idBook, String publishes, String status, double price) {
		super();
		this.idBook = idBook;
		this.publishes = publishes;
		this.status = status;
		this.price = price;
	}

	public String getIdBook() {
		return idBook;
	}

	public void setIdBook(String idBook) {
		this.idBook = idBook;
	}

	public String getPublishes() {
		return publishes;
	}

	public void setPublishes(String publishes) {
		this.publishes = publishes;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "TextBook [idBook=" + idBook + ", publishes=" + publishes + ", status=" + status + ", price=" + price
				+ "]";
	}
	
	
	
}
