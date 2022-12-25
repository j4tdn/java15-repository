package persistence;

// DTO --> load from tables --> convert lines to DTO
// for using in service or UI
public class ItemGroupRawData {
	private Integer igId;
	private String igName;
	private Integer amountOfItems;
	private String listOfItems;
	public ItemGroupRawData() {
		// TODO Auto-generated constructor stub
	}
	public ItemGroupRawData(Integer igId, String igName, Integer amountOfItems, String listOfItems) {
		this.igId = igId;
		this.igName = igName;
		this.amountOfItems = amountOfItems;
		this.listOfItems = listOfItems;
	}
	
	
}
