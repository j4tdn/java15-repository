package bean;

/**
 * Kiểu dữ liệu Item, Tự định nghĩa
 * + Mã MH
 * + Tên MH
 * + Giá bán
 * @author qphan
 *
 */
public class Item {
	// cấu trúc dữ liệu --> biến, thuộc tính
	// thuật toán --> hàm, phương thức
	public int itemId;
	public String name;
	public double price;
	
	// hàm khởi tạo rỗng mặc định
	// tạo ra ô nhớ ở heap với giá trị mặc định của các thuộc tính
	// chưa gán giá trị cho thuộc tính
	public Item() {
		// sẽ mất đi khi mình thêm hàm khởi tạo khác vào
	}
	
	public Item(int itemIdPr, String namePr, double pricePr) {
		this.itemId = itemIdPr;
		this.name = namePr;
		this.price = pricePr;
	}
	
	// itemA.toString()
	// itemB.toString()
	// itemA, itemB: đối tượng của class Item
	// itemA.toString --> this là itemA
	// itemB.toString --> this là itemB
	
	@Override
	public String toString() {
		return this.itemId + ", " + this.name + ", " + this.price;
	}
	
}
