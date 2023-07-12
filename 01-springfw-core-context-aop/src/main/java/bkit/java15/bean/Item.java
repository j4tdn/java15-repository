package bkit.java15.bean;

import java.util.List;

public class Item {

	private Integer id;
	private String name;
	private Double sellPrices;
	private List<String> providers;
	private ItemGroup itemGroup;
	
	public Item() {
	}

	public Item(Integer id, String name, Double sellPrices, List<String> providers, ItemGroup itemGroup) {
		this.id = id;
		this.name = name;
		this.sellPrices = sellPrices;
		this.providers = providers;
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

	public List<String> getProviders() {
		return providers;
	}

	public void setProviders(List<String> providers) {
		this.providers = providers;
	}

	public ItemGroup getItemGroup() {
		return itemGroup;
	}

	public void setItemGroup(ItemGroup itemGroup) {
		this.itemGroup = itemGroup;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", sellPrices=" + sellPrices + ", providers=" + providers
				+ ", itemGroup=" + itemGroup + "]";
	}
}
