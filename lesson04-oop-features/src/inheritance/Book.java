package inheritance;

public class Book {
	private String id;
	private String name;
	private double price;
	private String piblisher;
	
	public Book() {
	}

	public Book(String id, String name, double price, String piblisher) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.piblisher = piblisher;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPiblisher() {
		return piblisher;
	}

	public void setPiblisher(String piblisher) {
		this.piblisher = piblisher;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + ", piblisher=" + piblisher + "]";
	}
	
}
