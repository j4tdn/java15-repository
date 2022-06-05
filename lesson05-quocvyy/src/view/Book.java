package view;

public class Book {
	private String id;
	private double price;
	private String nsb;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public String toString() {
		return "Book [id=" + id + ", price=" + price + ", nsb=" + nsb + "]";
	}


	public Book(String id, double price, String nsb) {
		this.id = id;
		this.price = price;
		this.nsb = nsb;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getNsb() {
		return nsb;
	}

	public void setNsb(String nsb) {
		this.nsb = nsb;
	}
	
}
