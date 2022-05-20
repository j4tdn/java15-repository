package shopping;

public class ItemDetail {
	private Item item;
	private int quality;
	
	public ItemDetail() {

	}

	public ItemDetail(Item item, int quality) {
		super();
		this.item = item;
		this.quality = quality;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public int getQuality() {
		return quality;
	}

	public void setQuality(int quality) {
		this.quality = quality;
	}

	@Override
	public String toString() {
		return "ItemDetail [item=" + item + ", quality=" + quality + "]";
	}
	
	
}
