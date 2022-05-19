package shopping;

public class ItemDetail {
	private Item item;
	private int quantity;

	public ItemDetail() {

	}

	public ItemDetail(Item item, int amount) {
		super();
		this.item = item;
		this.quantity = amount;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public int getAmount() {
		return quantity;
	}

	public void setAmount(int amount) {
		this.quantity = amount;
	}

	@Override
	public String toString() {
		return "ItemDetail [item=" + item + ", amount=" + quantity + "]";
	}

}
