package persistence;

import java.util.List;

// DTO --> load from tables --> convert lines to DTO
// for using in service or UI

public class ItemGroupRawData {
	private Integer igId;
	private String igName;
	private Integer amountOfItems;
	private String listOfItems;
	
	public ItemGroupRawData() {
	}

	public ItemGroupRawData(Integer igId, String igName, Integer amountOfItems, String listOfItems) {
		this.igId = igId;
		this.igName = igName;
		this.amountOfItems = amountOfItems;
		this.listOfItems = listOfItems;
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

	public String getListOfItems() {
		return listOfItems;
	}

	public void setListOfItems(String listOfItems) {
		this.listOfItems = listOfItems;
	}
	
	
	
}
