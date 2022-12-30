package persistence;

import java.util.List;

//DTO --> load from tables --> convert lines to DTO
// for using in service or UI
public class ItemGroupDto {
	private Integer igId;
	private String igName;
	private Integer amountOfItems;
	private List<ItemDto> items;
	
	public ItemGroupDto() {
		// TODO Auto-generated constructor stub
	}

	public ItemGroupDto(Integer igId, String igName, Integer amountOfItems) {
		super();
		this.igId = igId;
		this.igName = igName;
		this.amountOfItems = amountOfItems;
	}
	
	public ItemGroupDto(Integer igId, String igName, Integer amountOfItems, List<ItemDto> items) {
		super();
		this.igId = igId;
		this.igName = igName;
		this.amountOfItems = amountOfItems;
		this.items = items;
	}

	@Override
	public String toString() {
		return "ItemGroupDto [igId=" + igId + ", igName=" + igName + ", items=" + items + ", amountOfItems="
				+ amountOfItems + "]";
	}

	public Integer getIgId() {
		return igId;
	}

	public void setIgId(Integer igId) {
		this.igId = igId;
	}

	public String getIgName() {
		return igName;
	}

	public void setIgName(String igName) {
		this.igName = igName;
	}

	public Integer getAmountOfItems() {
		return amountOfItems;
	}

	public void setAmountOfItems(Integer amountOfItems) {
		this.amountOfItems = amountOfItems;
	}

	public List<ItemDto> getListOfItems() {
		return items;
	}

	public void setListOfItems(List<ItemDto> items) {
		this.items = items;
	}
	
}
