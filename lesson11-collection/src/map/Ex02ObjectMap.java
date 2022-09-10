package map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import bean.WareHouse;
import bean.Item;

public class Ex02ObjectMap {
	public static void main(String[] args) {
		//Map<Entry<K, V>> K: overrides hashcode, equals
		//Note: number of attributes in hashcode, equals must be the same
		Map<WareHouse, List<Item>> warehouses = inventory();
		
		warehouses.put(new WareHouse("WH 4", "Đà Nẵng"),
				Arrays.asList(new Item(11, "A", 110, 1011)));
		
		warehouses.put(new WareHouse("WH 1", "Vũng Tàu"),
				Arrays.asList(new Item(11, "A", 110, 1011)));
		
		loop(warehouses);
	}
	
	private static Map<WareHouse, List<Item>> inventory(){
		Map<WareHouse, List<Item>> inventory = new HashMap<>();
		inventory.put(new WareHouse("WH 1", "Vũng Tàu"),
				Arrays.asList(new Item(1, "A", 10, 101)));
		
		inventory.put(new WareHouse("WH 2", "Quảng Ngãi"),
				Arrays.asList(new Item(2, "B", 20, 102)));
		
		inventory.put(new WareHouse("WH 3", "Bình Định"),
				Arrays.asList(new Item(3, "C", 30, 103)));
		
		return inventory;
	}
	
	private static <K, V> void loop(Map<K, V> map) {
		for(Entry<K, V> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "===>" + entry.getValue());
		}
	}
}
