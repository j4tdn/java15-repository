package persistence;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

public class ItemGroup {
	private Integer id;
	private String name;
	private List<Item> items = new ArrayList<>();
	
	public ItemGroup() {
	}
	public ItemGroup(String lineFiles) {
		String[] tokens = lineFiles.split(", ");
		this.id = Integer.parseInt(tokens[0]);
		this.name = tokens[1];
	}

	public ItemGroup(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
	public ItemGroup(ItemGroup that, List<Item> items) {
		this.id = that.getId();
		this.name = that.getName();
		this.items = items;
	}
	public ItemGroup(Entry<ItemGroup, List<Item>> entry)
	{
		this(entry.getKey(), entry.getValue());
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
		return "\n\n\nItemGroup [id=" + id + ", name=" + name + ", items=" + items + "]";
	}

	

}
