package persistence;

import java.time.LocalTime;

public class Item {
	private Integer id;
	private String name;
	private String color;
	
	private ItemGroup itemGroup; // mapping 1-N
	
	private LocalTime orderTime;
	
	public Item() {
	}

	public Item(Integer id, String name, String color, ItemGroup itemGroup) {
		this.id = id;
		this.name = name;
		this.color = color;
		this.itemGroup = itemGroup;
	}
	
	public Item(Integer id, String name, LocalTime orderTime) {
		this.id = id;
		this.name = name;
		this.orderTime = orderTime;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public ItemGroup getItemGroup() {
		return itemGroup;
	}

	public void setItemGroup(ItemGroup itemGroup) {
		this.itemGroup = itemGroup;
	}

	public LocalTime getOrderDate() {
		return orderTime;
	}

	public void setOrderDate(LocalTime orderTime) {
		this.orderTime = orderTime;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", color=" + color + ", itemGroup=" + itemGroup + "]";
	}

	
	
	
	
	
	

	
	
	
}