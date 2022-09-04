package map;

import java.security.KeyStore.Entry;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Item;
import bean.WareHouse;

public class Ex02ObjectMap {
	public static void main(String[] args) {
		// Map<Entry<K , V >> K : overrides hashcode , equals
		// note : number of attributes in hashcode , equals must be the same
		Map<WareHouse, List<Item>> warehouses = inventory();

		warehouses.put(new WareHouse("WH4", "Da Nang"), Arrays.asList(new Item(11, "AA", 110, 1011)));
		warehouses.put(new WareHouse("WH1", "San Diego"), Arrays.asList(new Item(1, "A", 10, 101)));
		System.out.println("size : " + warehouses.size());
		loop(warehouses);
	}

	private static Map<WareHouse, List<Item>> inventory() {
		Map<WareHouse, List<Item>> inventory = new HashMap<>();

		inventory.put(new WareHouse("WH1", "San Diego"), Arrays.asList(new Item(1, "A", 10, 101)));

		inventory.put(new WareHouse("WH2", "Phoenix"), Arrays.asList(new Item(2, "B", 20, 102)));

		inventory.put(new WareHouse("WH3", "Utah"), Arrays.asList(new Item(3, "C", 30, 103)));
		return inventory;
	}

	private static <K, V> void loop(Map<K, V> map) {
		for (java.util.Map.Entry<K, V> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "===>" + entry.getValue());
		}
	}
}
