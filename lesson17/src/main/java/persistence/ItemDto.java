package persistence;

import java.time.LocalTime;

public class ItemDto {
	private String name;
	private String size;
	private Integer amount;

	public ItemDto() {
		// TODO Auto-generated constructor stub
	}

	

	public ItemDto(String name, String size, Integer amount) {
		super();
		this.name = name;
		this.size = size;
		this.amount = amount;
	}



	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getSize() {
		return size;
	}



	public void setSize(String size) {
		this.size = size;
	}



	public Integer getAmount() {
		return amount;
	}



	public void setAmount(Integer amount) {
		this.amount = amount;
	}


	public static ItemDto convert(String result) {
		String[] tokens = result.split("-");
		ItemDto itemDto = null;
		if (tokens.length == 3) {
			itemDto = new ItemDto(tokens[0],tokens[1],Integer.parseInt(tokens[2]));
		}
		return itemDto;
	}



	@Override
	public String toString() {
		return "ItemDto [name=" + name + ", size=" + size + ", amount=" + amount + "]";
	}

	
	
	

}
