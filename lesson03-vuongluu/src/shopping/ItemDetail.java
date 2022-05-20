package shopping;

public class ItemDetail {
	private Item item;
	private int quantity;

	public ItemDetail() {
	}

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

	public ItemDetail(Item item, int quantity) {
		super();
		this.item = item;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "ItemDetail [item=" + item + ", quantity=" + quantity + "]";
	}
}