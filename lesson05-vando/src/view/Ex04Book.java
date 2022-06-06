package view;

public class Ex04Book {
    private String idBook, PublishingCompany;
    private double price;
    public Ex04Book() {

    }
	public Ex04Book(String idBook, String publishingCompany, double price) {
		this.idBook = idBook;
		PublishingCompany = publishingCompany;
		this.price = price;
	}
	public String getIdBook() {
		return idBook;
	}
	public void setIdBook(String idBook) {
		this.idBook = idBook;
	}
	public String getPublishingCompany() {
		return PublishingCompany;
	}
	public void setPublishingCompany(String publishingCompany) {
		PublishingCompany = publishingCompany;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return  idBook + ", " + PublishingCompany + ", " + price ;
	}
    
}
