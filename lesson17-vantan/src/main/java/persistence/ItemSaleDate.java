package persistence;

import java.time.LocalDate;
import java.time.LocalTime;

public class ItemSaleDate {
	private Integer id;
	private String name;
	private LocalTime time;
	
	public ItemSaleDate() {
	}

	public ItemSaleDate(Integer id, String name, LocalTime time) {
		this.id = id;
		this.name = name;
		this.time = time;
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

	public LocalTime getTime() {
		return time;
	}

	public void setDate(LocalTime time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "ItemSaleDate [id=" + id + ", name=" + name + ", time=" + time + "]";
	}
	
	
}
