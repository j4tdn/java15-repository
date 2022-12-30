package persistence;

public class ItemDtoByIG {
	private Integer id;
	private String name;
	private String color;
	private ItemGroup ig;
	private Integer price;
	
	public ItemDtoByIG() {
		// TODO Auto-generated constructor stub
	}

	public ItemDtoByIG(Integer id, String name, String color, ItemGroup ig, Integer price) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.ig = ig;
		this.price = price;
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

	public ItemGroup getIg() {
		return ig;
	}

	public void setIg(ItemGroup ig) {
		this.ig = ig;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ItemDtoByIG [id=" + id + ", name=" + name + ", color=" + color + ", ig=" + ig + ", price=" + price
				+ "]";
	}
	
	
}
