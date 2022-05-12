package bean;

/*
 * Kiểu dữ liệu Item, Tự định nghĩa
 * + Mã MH
 * + Tên MH
 * + Giá bán
 */
public class Item {
	// cấu trúc dữ liệu --> biến, thuộc tính
	// thuật toán --> hàm, phương thức
	public int itemId;
	public String name;
	public double price;
	
	// Hàm khởi tạo rỗng mặc định, tạo ra ô nhớ ở HEAP với giá trị mặc định của các thuộc tính, chưa
	// gán giá trị cho thuộc tính
	public Item() {
		// sẽ mất đi khi mình thêm hàm khơi tạo khác vào
	}
	
	public Item(int itemIdPr, String namePr, double pricePr) {
		this.itemId = itemIdPr;
		this.name = namePr;
		this.price = pricePr;
	}
	// itemA.toString()
	// itemB.toString()
	// itemA, itemB là đối tượng của Class Item
	// itemA.toString --> this là itemA
	// itemB.toString --> this là itemB
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.itemId + ", " + this.name + ", " + this.price;
		
	}
}
