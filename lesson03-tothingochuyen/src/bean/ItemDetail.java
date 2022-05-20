package bean;

public class ItemDetail {
	private Item item;
	private int quantity;
	
	public ItemDetail() {
		
	}

	public ItemDetail(Item item, int quantity) {
		this.item = item;
		this.quantity = quantity;
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

	@Override
	public String toString() {
		return "[item=" + item + ", quantity=" + quantity + "]" + "\n";
	}
	
	
}
