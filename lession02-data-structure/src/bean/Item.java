package bean;

public class Item {
	
	public int ItemId;
	public String name;
	public double price;
	public Item() {
		
	}
	public Item(int ItemIdPr, String namePr, double pricePr) {
		this.ItemId = ItemIdPr;
		this.name = namePr;
		this.price = pricePr;
	}
	@Override
	public String toString() {
			return this.ItemId + ", " + this.name + ", " + this.price;
		
	}
	
	
}
