package map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Item;
import bean.WareHouse;

public class Ex02ObjectMap {
	public static void main(String[] args) {
		
		
	}
	
	private static Map<WareHouse, List<Item>> inventory(){
		Map<WareHouse, List<Item>> inventory = new HashMap<>();
		
		inventory.put
				(new WareHouse ("WH 1", "Vung Tau")
			   , Arrays.asList(new Item (1, "A", 10, 201)));
		inventory.put
		(new WareHouse ("WH 2", "Quang Ngai")
	   , Arrays.asList(new Item (1, "A", 10, 201)));
		inventory.put
		(new WareHouse ("WH 3", "Binh Dinh")
	   , Arrays.asList(new Item (1, "A", 10, 201)));
		return inventory;
	}
		
	
}
