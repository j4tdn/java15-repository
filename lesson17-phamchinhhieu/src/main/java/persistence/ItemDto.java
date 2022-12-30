package persistence;

import java.time.LocalTime;

public class ItemDto {
	private Integer id;
	private String name;
	private LocalTime deliveryTime;
	private Integer amount;
	private String size;
	
	public ItemDto() {
		// TODO Auto-generated constructor stub
	}
	

	public ItemDto(String name, String size, Integer amount) {
		this.name = name;
		this.amount = amount;
		this.size = size;
	}


	public ItemDto(Integer id, String name, Integer amount) {
		super();
		this.id = id;
		this.name = name;
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

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public LocalTime getDeliveryTime() {
		return deliveryTime;
	}

	public void setDeliveryTime(LocalTime deliveryTime) {
		this.deliveryTime = deliveryTime;
	}
	public ItemDto(Integer id, String name, LocalTime deliveryTime) {
		super();
		this.id = id;
		this.name = name;
		this.deliveryTime = deliveryTime;
	}

	public static ItemDto convert(String sequence) {
		String[] tokens = sequence.split("-");
		ItemDto itemDto = null;
		if(tokens.length == 3) {
			itemDto = new ItemDto(tokens[0], tokens[1],Integer.parseInt(tokens[2]));
		}
		return itemDto;
	}


	@Override
	public String toString() {
		return "ItemDto [name=" + name + ", size=" + size + ", amount=" + amount + "]";
	}

	

	
	
}
