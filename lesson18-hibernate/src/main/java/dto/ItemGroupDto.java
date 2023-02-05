package dto;

public class ItemGroupDto {
	
	public static final String PROP_IG_ID = "igId";
	public static final String PROP_IG_NAME = "igName";
	public static final String PROP_AMOUNT_OF_ITEMS = "amountOfItems";
	
	private Integer igId;
	private String igName;
	private Long amountOfItems;
	
	/**
	 * Empty constructor
	 */
	public ItemGroupDto() {
	}

	public ItemGroupDto(Integer igId, String igName, Long amountOfItems) {
		this.igId = igId;
		this.igName = igName;
		this.amountOfItems = amountOfItems;
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

	public Long getAmountOfItems() {
		return amountOfItems;
	}

	public void setAmountOfItems(Long amountOfItems) {
		this.amountOfItems = amountOfItems;
	}

	@Override
	public String toString() {
		return "ItemGroupDto [igId=" + igId + ", igName=" + igName + ", amountOfItems=" + amountOfItems + "]";
	}
}
