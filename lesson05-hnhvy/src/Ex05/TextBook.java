package Ex05;

public class TextBook extends Book{
	//Sách giáo khoa: Mã sách, đơn giá, nhà xuất bản, tình trạng (mới, cũ).
	private String status;
	
	public TextBook() {
	}

	public TextBook(String bookId, int price, String publishingCompany, String status) {
		super(bookId, price, publishingCompany);
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}