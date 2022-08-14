package bean;

public class ItemDetail {
	private int itemId;
	private int storeId;
	private String name;
	private double price;
	
	
	public ItemDetail(int itemId, int storeId, String name, double price) {
		super();
		this.itemId = itemId;
		this.storeId = storeId;
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "\nItemDetail [itemId=" + itemId + ", storeId=" + storeId + ", name=" + name + ", price=" + price + "]";
	}

	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
