package shopping;

public class ItemDetail {
	private Item item;
	private int quantity;
	
	public ItemDetail() {
	}
	// Source + Generate Constructor using Fields
	public ItemDetail(Item item, int quantity) {
		super();
		this.item = item;
		this.quantity = quantity;
	}
	// Source + Generate Getter and Setter
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	// Source + Generate to String
	@Override
	public String toString() {
		return "ItemDetail [item=" + item + ", quantity=" + quantity + "]";
	}

}
