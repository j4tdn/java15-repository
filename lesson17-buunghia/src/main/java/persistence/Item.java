package persistence;

import java.time.LocalDate;

public class Item {
	private Integer id;
	private String name;
	private String color;
	
	private ItemGroup itemGroup; // mapping 1-N
	
	private LocalDate orderDate;
	
	public Item() {
	}

	public Item(Integer id, String name, String color, ItemGroup itemGroup) {
		this.id = id;
		this.name = name;
		this.color = color;
		this.itemGroup = itemGroup;
	}
	
	public Item(Integer id, String name, LocalDate orderDate) {
		this.id = id;
		this.name = name;
		this.orderDate = orderDate;
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

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", orderDate=" + orderDate + "]";
	}
	
	
	
	

	
	
	
}