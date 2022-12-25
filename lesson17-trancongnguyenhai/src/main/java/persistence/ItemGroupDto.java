package persistence;

import java.util.List;

public class ItemGroupDto {
	private int id;
	private String name;
	private String items;
	private int amount;
	
	public ItemGroupDto() {

	}

	public ItemGroupDto(int id, String name, String items, int amount) {
		this.id = id;
		this.name = name;
		this.items = items;
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getItems() {
		return items;
	}

	public void setItems(String items) {
		this.items = items;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "ItemGroupDto [id=" + id + ", name=" + name + ", items=" + items + ", amount=" + amount + "]";
	}
	
	
}
