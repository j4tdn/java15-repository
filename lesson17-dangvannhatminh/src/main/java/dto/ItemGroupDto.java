package dto;

public class ItemGroupDto {
	private Integer id;
	private String name;
	private String listItem;
	private Integer quantity;
	public ItemGroupDto() {
		// TODO Auto-generated constructor stub
	}
	
	public ItemGroupDto(Integer id, String name, String listItem, Integer quantity) {
		this.id = id;
		this.name = name;
		this.listItem = listItem;
		this.quantity = quantity;
	}
	

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getListItem() {
		return listItem;
	}
	public void setListItem(String listItem) {
		this.listItem = listItem;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "\nItemGroupDto [id=" + id + ", name=" + name + ", listItem=" + listItem + ", quantity=" + quantity + "]";
	}
	
	
}
