package ex05;

import java.util.Scanner;

public abstract class Book {
	private String id;
	private long price;
	private String placeOfPublication;

	public Book() {
	}

	public Book(String idTB, long price, String placeOfPublication) {
		this.id = idTB;
		this.price = price;
		this.placeOfPublication = placeOfPublication;
	}

	public String getIdTB() {
		return id;
	}

	public void setIdTB(String idTB) {
		this.id = idTB;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String getPlaceOfPublication() {
		return placeOfPublication;
	}

	public void setPlaceOfPublication(String placeOfPublication) {
		this.placeOfPublication = placeOfPublication;
	}

	public abstract double getCost();

	@Override
	public String toString() {
		return "Book [idTB=" + id + ", price=" + price + ", placeOfPublication=" + placeOfPublication + "]";
	}
}