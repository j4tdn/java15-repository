package persistence;

public class ItemDtoV4 {
	private String name;

	public ItemDtoV4() {
		// TODO Auto-generated constructor stub
	}

	public ItemDtoV4(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ItemDtoV4 [name=" + name + "]";
	}
	
}
