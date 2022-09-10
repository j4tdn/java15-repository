package bean;

import java.util.Objects;

public class Item {
	private int itemId;
	private String name;
	private double price;
	private int storeId;

	public Item() {

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
		return "\nItem [itemId=" + itemId + ", name=" + name + ", price=" + price + ", storeId=" + storeId + "]";
	}

	public Item(int itemId, String name, double price, int storeId) {
		super();
		this.itemId = itemId;
		this.name = name;
		this.price = price;
		this.storeId = storeId;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Item)) {
			return false;
		}
//		if(o == null || o.getClass() != Item.class)
//		{
//			return false;
//		}
		Item that = (Item) o;
		
		return that.getItemId() == getItemId();
	}
	
	@Override
	public int hashCode() {
		// Objects.hash --> Áp dụng công thức hashing để hash item id ra
		// hashed balue --> dãy số
		return Objects.hash(getItemId());
	}
}
