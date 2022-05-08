package bean;

public class Item {
	public int itemId;
	public String name;
	public double price;

	public Item() {

	} // Sẽ mất đi khi mình thêm hàm khởi tạo khác vào

	public Item(int itemIdPr, String namePr, double pricePr) {
		this.itemId = itemIdPr;
		this.name = namePr;
		this.price = pricePr;
	}
	// itemA.toString();
	// itemB.toString();
	// itemA, item B: đối tượng của class Item;

	public String toString() {
		return this.itemId + "," + this.name + "," + this.price;

	}
}
