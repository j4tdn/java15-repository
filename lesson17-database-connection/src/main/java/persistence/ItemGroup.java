package persistence;

import java.util.List;
import java.util.Map.Entry;

public class ItemGroup {
	private Integer id;
	private String name;
	private List<Item> items; // mapping 1-N

	public ItemGroup() {
	}

	public ItemGroup(ItemGroup that, List<Item> items) {
		this.id = that.id;
		this.name = that.name;
		this.items = items;
	}
	
	// 123, Item 123
	public ItemGroup(String fileLine) {
		String[] tokens = fileLine.split(", ");
		if (tokens.length == 2) {
			this.id = Integer.parseInt(tokens[0]);
			this.name = tokens[1];
		}
	}

	public ItemGroup(Entry<ItemGroup, List<Item>> entry) {
		this(entry.getKey(), entry.getValue());
	}

	public ItemGroup(Integer id, String name) {
		this.id = id;
		this.name = name;
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

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "ItemGroup [id=" + id + ", name=" + name + ", --> items=" + items + "]";
	}
}
