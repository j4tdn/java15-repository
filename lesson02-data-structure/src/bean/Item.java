package bean;

public class Item {
	public int itemId;
	public String name;
	public double price;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.itemId + ", " + this.name + ", " + this.price;
	}
	public Item(int itemIdPr, String namePr, double pricePr) {
		this.itemId = itemIdPr;
		this.name = namePr;
		this.price = pricePr;
	}
}
