package persistence;

public class ItemDto {
	private Integer id;
	private String name;
	private Integer amount;
	
	public ItemDto() {
	}

	public ItemDto(Integer id, String name, Integer amount) {
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
	
	// 1-Ho Ten-SoLuong
	public static ItemDto convert(String sequence) {
		String[] tokens = sequence.split("-");
		ItemDto itemDto = null;
		if (tokens.length == 3) {
			itemDto = new ItemDto(
					Integer.parseInt(tokens[0]),
					tokens[1], 
					Integer.parseInt(tokens[2])
			);
		}
		return itemDto;
	}

	@Override
	public String toString() {
		return "ItemDto [id=" + id + ", name=" + name + ", amount=" + amount + "]";
	}
}
