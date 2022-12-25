package persistence;

public class Item {
	private Integer itemId;
	private String itemName;
	private String colour;
	private ItemGroup itemGroup;

	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(Integer itemId, String itemName, String colour, ItemGroup itemGroup) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.colour = colour;
		this.itemGroup = itemGroup;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public ItemGroup getItemGroup() {
		return itemGroup;
	}

	public void setItemGroup(ItemGroup itemGroup) {
		this.itemGroup = itemGroup;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", colour=" + colour + ", itemGroup=" + itemGroup
				+ "]";
	}
	
	
}
