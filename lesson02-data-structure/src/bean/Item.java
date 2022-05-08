package bean;

public class Item {
	 //cấu trúc dữ liệu --> biến, thuộc tính
	//thuật toán -->hàm, phương thức
	
	public int itemId;		
	public String name ;
	public double price;
	
	//gõ ctrl+ space để chọn hàm rồi đổi lại chỗ return để xuất ra đối tượng
	@Override
	public String toString() {
		return this.itemId + ", " + this.name + ", "  + this.price;
		
	}
	public Item() {
		// sẽ mất đi khi mình thêm hàm khởi tạo khác vào
	}
	
	public Item(int itemIdPr, String namePr, double pricePr) {
		this.itemId = itemIdPr;
		this.name = namePr;
		this.price = pricePr;
	}
}
