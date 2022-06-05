package ex05;

public class TextBook extends Book {
	private boolean status;

	public TextBook() {
	}

	public TextBook(String idTB, long price, String placeOfPublication, boolean status) {
		super(idTB, price, placeOfPublication);
		this.status = status;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public double getCost() {
		if (status == false) {
			return getPrice() * 0.3;
		}
		return getPrice();
	}

	@Override
	public String toString() {
		return super.toString() + "TextBook [status=" + status + "]";
	}
}