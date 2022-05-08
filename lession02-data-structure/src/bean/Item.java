package bean;
// Kiểu dữ liệu tự định nghĩa Item, gồm mã mặt hàng, tên mặt hàng, giá bán

public class Item {
	public int itemID;
	public String name;
	public double price;
	// Hàm khởi tạo mặc định => tạo ra ô nhở ở heap với giá trị mặc định của các thuộc tính id name price chứ chưa gán giá trị cho thuộc tính
	public Item() {
		
	}
	
	public Item(int itemIdPr, String namePr, double pricePr) {
		this.itemID=itemIdPr;
		this.name=namePr;
		this.price=pricePr;
		
	}

	@Override

	public String toString() {
		return this.itemID + "," + this.name + "," + this.price;

	}

}
