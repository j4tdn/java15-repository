package bean;

public class Item {
	private int itemId;
	private String name;
	private double price;
	private int storeId;
	
	public Item(int itemId, String string, int j, int k) {
	}

	public Item(int itemId, String name, double price, int storeId) {
		this.name = name;
		this.price = price;
		this.storeId = storeId;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(!(obj instanceof Item)) {
			return false;
		}
		Item that = (Item)obj;
		return getItemId() == that.getItemId();
	}

	

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
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

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + ", storeId=" + storeId + "]";
	}

}
