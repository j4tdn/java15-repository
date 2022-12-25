package persistence;

import java.time.LocalTime;

public class ItemDto {
	private int id;
	private String name;
	private LocalTime timeOrder;
	
	public ItemDto() {

	}

	public ItemDto(int id, String name, LocalTime timeOrder) {
		this.id = id;
		this.name = name;
		this.timeOrder = timeOrder;
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

	public LocalTime getTimeOrder() {
		return timeOrder;
	}

	public void setTimeOrder(LocalTime timeOrder) {
		this.timeOrder = timeOrder;
	}

	@Override
	public String toString() {
		return "ItemDto [id=" + id + ", name=" + name + ", timeOrder=" + timeOrder + "]";
	}
	
	

	
}
