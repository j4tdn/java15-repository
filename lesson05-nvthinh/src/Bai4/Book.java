package Bai4;

public class Book {
	private int idBook;
	private double unitPrice;
	private String namePublisher;
	
	
	public Book() {
		
	}
	
	public Book(int idBook, double unitPrice, String namePublisher ) {
		this.idBook=idBook;
		this.unitPrice=unitPrice;
		this.namePublisher=namePublisher;
	}

	public int getIdBook() {
		return idBook;
	}

	public void setIdBook(int idBook) {
		this.idBook = idBook;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getNamePublisher() {
		return namePublisher;
	}

	public void setNamePublisher(String namePublisher) {
		this.namePublisher = namePublisher;
	}
	
}
