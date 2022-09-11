package map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import bean.Item;
import bean.WareHouse;

public class Ex02ObjectMap {
	public static void main(String[] args) {
		Map<WareHouse, List<Item>> wareHouse = inventory();
		
		System.out.println("size " + wareHouse.size());
		
		loop(wareHouse);
		
		
	}
	
	private static Map<WareHouse, List<Item>> inventory(){
		Map<WareHouse, List<Item>> inventory = new HashMap<>();
		inventory.put(new WareHouse("Wh 1", "Vung Tau"), Arrays.asList(new Item(1, "A", 10, 101)));
		inventory.put(new WareHouse("Wh 2", "Ca Mau"), Arrays.asList(new Item(2, "B", 12, 102)));
		inventory.put(new WareHouse("Wh 3", "Hue"), Arrays.asList(new Item(3, "C", 13, 103)));
		
		return inventory;
	}
	
	private static <K, V> void loop(Map<K, V> map) {
		for(Entry<K, V> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " ===> " +entry.getValue());
		}
	}
}
