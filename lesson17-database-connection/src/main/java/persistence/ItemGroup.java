package persistence;

import java.util.List;
import java.util.Map.Entry;

public class ItemGroup {
    private Integer id;
    private String name;
    private List<Item> items; // mapping 1-N
    public ItemGroup() {
		// TODO Auto-generated constructor stub
	}
    
    
	public ItemGroup(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
    

	public ItemGroup(ItemGroup that , List<Item> items) {
		
		this.id = that.id;
		this.name = that.name;
		this.items = items;
	}
	public ItemGroup(Entry<ItemGroup, List<Item>> entry) {
		this(entry.getKey(),entry.getValue());
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
	public List<Item> getItems() {
		return items;
	}


	public void setItems(List<Item> items) {
		this.items = items;
	}


	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "ItemGroup [id=" + id + ", name=" + name + ", items=" + items + "]";
	}
    
}
