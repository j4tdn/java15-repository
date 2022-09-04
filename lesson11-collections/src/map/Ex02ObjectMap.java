package map;

import java.security.KeyStore.Entry;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import bean.Item;
import bean.Warehouse;
public class Ex02ObjectMap {

	public static void main(String[] args) {
		Map<Warehouse, List<Item>> warehouses	 = inventory();
		warehouses.put(
				new Warehouse("WH 4" , "Da Nang "),
				Arrays.asList(new Item(11,"AA", 110, 1011)));
		warehouses.put(
				new Warehouse("WH 1" , "Vung Tau"),
				Arrays.asList(new Item(1,"A", 10, 101)));
				
		System.out.println(warehouses.size());
		loop(warehouses);
	}
	
	private static Map<Warehouse, List<Item>> inventory(){
		Map<Warehouse, List<Item>> inventory = new HashMap<>();
		
		inventory.put(
				new Warehouse("WH 1", "Vung Tau"), 
				Arrays.asList(new Item(1,"A", 10, 101)));
		inventory.put(
				new Warehouse("WH 2", "quang ngai"), 
				Arrays.asList(new Item(2,"B", 20, 102)));
		inventory.put(
				new Warehouse("WH 3", "Binh dinh"), 
				Arrays.asList(new Item(3,"C", 30, 103)));
		return inventory;
	}
	
	private static <K, V> void loop(Map<K, V> map) {
		for(java.util.Map.Entry<K, V> entry : map.entrySet() ){
			System.out.println(entry + " ");
		}
		
		System.out.println();
	}
	
}





