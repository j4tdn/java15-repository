package bkit.java15.bean;

import java.util.List;

public class Item {
	private Integer id;
	private String name;
	private Double sellPrices;
	private List<String> provider;
	private ItemGroup itemGroup;
	public Item() {
		// TODO Auto-generated constructor stub
	}
	public Item(Integer id, String name, Double sellPrices, List<String> provider, ItemGroup itemGroup) {
		super();
		this.id = id;
		this.name = name;
		this.sellPrices = sellPrices;
		this.provider = provider;
		this.itemGroup = itemGroup;
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
	public Double getSellPrices() {
		return sellPrices;
	}
	public void setSellPrices(Double sellPrices) {
		this.sellPrices = sellPrices;
	}
	public List<String> getProvider() {
		return provider;
	}
	public void setProvider(List<String> provider) {
		this.provider = provider;
	}
	public ItemGroup getItemGroup() {
		return itemGroup;
	}
	public void setItemGroup(ItemGroup itemGroup) {
		this.itemGroup = itemGroup;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", sellPrices=" + sellPrices + ", provider=" + provider
				+ ", itemGroup=" + itemGroup + "]";
	}
	
}
