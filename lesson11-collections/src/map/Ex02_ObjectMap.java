package map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import bean.Item;
import bean.Warehouse;

public class Ex02_ObjectMap {
	public static void main(String[] args) {
		Map<Warehouse, List<Item>> warehouses = inventory();
		 System.out.println("size: " + warehouses.size() );
		 warehouses.put(new Warehouse("WH 2", "Vung Tau"), Arrays.asList(new Item(1, "A", 10, 101)));
		 warehouses.put(new Warehouse("WH 2", "Quang Ngai"), Arrays.asList(new Item(2, "B", 20, 102)));
		 loop(warehouses);
	}
	
	private static Map<Warehouse, List<Item>> inventory(){
		Map<Warehouse, List<Item>> inventory = new HashMap<>();
		
		inventory.put(new Warehouse("WH 1", "Vung Tau"), Arrays.asList(new Item(1, "A", 10, 101)));
		inventory.put(new Warehouse("WH 2", "Quang Ngai"), Arrays.asList(new Item(2, "B", 20, 102)));
		inventory.put(new Warehouse("WH 3", "Binh Dinh"), Arrays.asList(new Item(3, "C", 30, 103)));
		return inventory;
	}
	
	private static <K, V>void loop(Map<K, V> map){
		for(Entry<K,V> entry: map.entrySet()) {
			System.out.println(entry + " ");
		}
	}
}
