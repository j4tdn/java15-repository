package titv;

public class Book {
	private String bookName;
	private double price;
	private int year;
	private Author author;
	
	public Book(String bookName, double price, int year, Author  author) {
		this.bookName = bookName;
		this.price = price;
		this.year = year;
		this.author = author;
		
	}

	
	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public Author getAuthor() {
		return author;
	}


	public void setAuthor(Author author) {
		this.author = author;
	}


	public void printBookName() {
		System.out.println(this.bookName);
	}
	
	public boolean compareYear(Book otherBook) {
		return this.year != otherBook.year;
		
	}
	public double afterDiscout(double x) {
		return this.price*(1-x/100);
	}
	
}
