package persistence;

import java.util.List;

public class ItemGroupDto {
	private Integer igId;
	private String igName;
	private Integer amountOfItmes;
	private List<ItemDto> items;

	public ItemGroupDto() {
		// TODO Auto-generated constructor stub
	}

	public List<ItemDto> getItems() {
		return items;
	}

	public void setItems(List<ItemDto> items) {
		this.items = items;
	}
	
	public ItemGroupDto(Integer igId, String igName, Integer amountOfItmes, List<ItemDto> items) {
		super();
		this.igId = igId;
		this.igName = igName;
		this.amountOfItmes = amountOfItmes;
		this.items = items;
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

	public Integer getAmountOfItmes() {
		return amountOfItmes;
	}

	public void setAmountOfItmes(Integer amountOfItmes) {
		this.amountOfItmes = amountOfItmes;
	}

	public List<ItemDto> getListOfItmes() {
		return items;
	}

	public void setListOfItmes(List<ItemDto> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "ItemGroupDto [igId=" + igId + ", igName=" + igName + ", amountOfItmes=" + amountOfItmes + ", items="
				+ items + "]";
	}

}
