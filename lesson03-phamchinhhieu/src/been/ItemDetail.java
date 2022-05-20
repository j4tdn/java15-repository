package been;

public class ItemDetail {
	private Item item;
	private int quantity;
	
	public ItemDetail() {
		// TODO Auto-generated constructor stub
	}

	public ItemDetail(Item id, int quantity) {
		super();
		this.item = id;
		this.quantity = quantity;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item id) {
		this.item = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "ItemDetail [id=" + item + ", quantity=" + quantity + "]";
	}
	
}
