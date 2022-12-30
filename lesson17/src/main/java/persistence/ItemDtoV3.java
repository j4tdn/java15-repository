package persistence;

public class ItemDtoV3 {
	private Integer id;
	private String name;
	private String colour;
	private ItemGroup ig;
	private Double price;

	public ItemDtoV3() {
		// TODO Auto-generated constructor stub
	}

	public ItemDtoV3(Integer id, String name, String colour, ItemGroup ig, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.colour = colour;
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

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public ItemGroup getIg() {
		return ig;
	}

	public void setIg(ItemGroup ig) {
		this.ig = ig;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ItemDtoV3 [id=" + id + ", name=" + name + ", colour=" + colour + ", ig=" + ig + ", price=" + price
				+ "]";
	}
	
}
