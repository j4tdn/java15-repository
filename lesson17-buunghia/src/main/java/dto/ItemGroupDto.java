package dto;

import java.util.List;

public class ItemGroupDto {
	private Integer id;
	private String name;
	private List<ItemDto> items;
	private Integer amount;
	public ItemGroupDto() {}
	public ItemGroupDto(Integer id, String name, List<ItemDto> items, Integer amount) {
		this.id = id;
		this.name = name;
		this.items = items;
		this.amount = amount;
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
	public List<ItemDto> getItems() {
		return items;
	}
	public void setItems(List<ItemDto> items) {
		this.items = items;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "ItemGroupDto [id=" + id + ", name=" + name + ", items=" + items + ", amount=" + amount + "]";
	}
	
	
}
