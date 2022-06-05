package Ex05;

public class Book {
	
	private String bookId;
	private int price;
	private String publishingCompany;
	
	public Book() {
	}
	
	public Book(String bookId, int price, String publishingCompany) {
		this.bookId = bookId;
		this.price = price;
		this.publishingCompany = publishingCompany;
	}



	public String getbookId() {
		return bookId;
	}

	public void setbookId(String bookId) {
		this.bookId = bookId;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublishingCompany() {
		return publishingCompany;
	}

	public void setPublishingCompany(String publishingCompany) {
		this.publishingCompany = publishingCompany;
	}
	
	
}