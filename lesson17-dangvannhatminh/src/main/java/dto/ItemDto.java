package dto;

import java.time.LocalTime;

public class ItemDto {
	private Integer id;
	private String name;
	private Integer SoLuong;
	private LocalTime deliveryTime;
	public ItemDto() {
	}
	
	public ItemDto(Integer id, String name, LocalTime deliveryTime) {
		this.id = id;
		this.name = name;
		this.deliveryTime = deliveryTime;
	}

	public ItemDto(Integer id, String name, Integer soLuong) {
		this.id = id;
		this.name = name;
		this.SoLuong = soLuong;
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
	public LocalTime getDeliveryDate() {
		return deliveryTime;
	}
	public void setDeliveryDate(LocalTime deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public Integer getSoLuong() {
		return SoLuong;
	}

	public void setSoLuong(Integer soLuong) {
		SoLuong = soLuong;
	}

	@Override
	public String toString() {
		return "\nItemDto [id=" + id + ", name=" + name + ", SoLuong=" + SoLuong + ", deliveryTime=" + deliveryTime + "]";
	}
	
	
}
