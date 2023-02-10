package dto;

public class ItemDto {
	private String name;
	private String size;
	private Integer amount;
	public ItemDto() {}
	public ItemDto(String name, String size, Integer amount) {
		this.name = name;
		this.size = size;
		this.amount = amount;
	}
	public ItemDto(String stringAsItem) {
		String[] tokens = stringAsItem.split("-");
		if (tokens.length == 3) {
			this.name = tokens[0];
			this.size = tokens[1];
			this.amount = Integer.parseInt(tokens[2]);
		}
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
	@Override
	public String toString() {
		return "ItemDto [name=" + name + ", size=" + size + ", amount=" + amount + "]";
	}
	
	
}
