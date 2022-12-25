package dto;

import persistence.ItemGroup;

public class ItemDtoByIG {
	private Integer id;
	private String name;
	private String color;
	private ItemGroup itemGroup; //mapping 1-n
	private double GiaBan;
	public ItemDtoByIG() {
		// TODO Auto-generated constructor stub
	}
	
	public ItemDtoByIG(Integer id, String name, String color, ItemGroup itemGroup, double giaBan) {
		this.id = id;
		this.name = name;
		this.color = color;
		this.itemGroup = itemGroup;
		this.GiaBan = giaBan;
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
	public double getGiaBan() {
		return GiaBan;
	}
	public void setGiaBan(double giaBan) {
		GiaBan = giaBan;
	}

	@Override
	public String toString() {
		return "\nItemDtoByIG [id=" + id + ", name=" + name + ", color=" + color + ", itemGroup=" + itemGroup
				+ ", GiaBan=" + GiaBan + "]";
	}
	
	
}
