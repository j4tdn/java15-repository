package bean;

/**
 * Kiểu dữ liệu item, tự định nghĩa
 * + Mã MH
 * + Tên MH
 * + Giá bán
 * @author ADMIN
 *
 */
public class Item {
	// cấu trúc dữ liệu --> biến, thuộc tính
	// thuật toán --> hàm, phương thức
	public int itemId;
	public String name;
	public double price;

	public Item() {
		
	}
	
	public Item(int itemIdPr, String namePr, double pricePr) {
		this.itemId = itemIdPr;
		this.name = namePr;
		this.price = pricePr;
		
	}
	
	
	// itemA.toString()
	// itemB.toString()
	// itemA, itemB :  đối tượng của class item
	// 
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this .itemId + ", " + this.name + ", " + this.price;
		
	}
}
