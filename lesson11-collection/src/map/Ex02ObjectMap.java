package map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import bean.Item;
import bean.Warehouse;

public class Ex02ObjectMap {
	public static void main(String[] args) {
		// Map<Entry<K, V>> K: overrides hashcode, equals
		// Note: number of attributes in hashcode, equals must be the same
		Map<Warehouse, List<Item>> warehouses = inventory();
		
		// System.identityHashCode(ox) = ox.hashCode()
		// override --> hashed value from attributes
		
		warehouses.put(
				new Warehouse("WH 4", "Đà Nẵng"), 
				Arrays.asList(new Item(11, "AA", 110, 1011)));
		
		warehouses.put(
				new Warehouse("WH 4", "Đà Nẵng"), 
				Arrays.asList(new Item(1, "A", 10, 101)));
		
		loop(warehouses);
	}
	
	private static Map<Warehouse, List<Item>> inventory() {
		Map<Warehouse, List<Item>> inventory = new HashMap<>();
		
		inventory.put(
				new Warehouse("WH 1", "Vũng Tàu"), 
				Arrays.asList(new Item(1, "A", 10, 101)));
		
		inventory.put(
				new Warehouse("WH 2", "Quảng Ngãi"), 
				Arrays.asList(new Item(2, "B", 20, 102)));
		
		inventory.put(
				new Warehouse("WH 3", "Bình Định"), 
				Arrays.asList(new Item(3, "C", 30, 103)));
		
		return inventory;
	}
	
	private static <K, V> void loop(Map<K, V> map) {
		for (Entry<K, V> entry: map.entrySet()) {
			System.out.println(entry.getKey() + "===>" + entry.getValue());
		}
	}
}
