package bean;

/**
 * Kiểu dữ liệu Item, Tự định nghĩa
 * + Mã MH
 * + Tên MH
 * + Gía bán
 * @author Tuyết
 *
 */
public class Item {
	// cấu trúc dữ liệu --> biến, thuộc tính
	// thuật toán --> hàm, phương thức
	public int itemID;
	public String name;
	public double price;
	
	@Override
	public String toString() {
		return this.itemID + ", " + this.name + ", " + this.price;
	}
	public Item() {
		
	}
	public Item (int itemIdPR, String namePr, double pricePr) {
		this.itemID = itemIdPR;
		this.name = namePr;
		this.price = pricePr;
	}
}
