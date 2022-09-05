package map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Item;
import bean.Warehouse;

public class Ex02ObjectMap {
	public static void main(String[] args) {
		System.out.println();
	}
	private static Map<Warehouse, List<Item>> inventory(){
		Map<Warehouse, List<Item>> inventory = new HashMap<>();
		
		inventory.put(
					new Warehouse("WH 1", "Vung Tau"),
					Arrays.asList(new Item(1,"A",10,101)));
		inventory.put(
				new Warehouse("WH 2", "Nha Trang"),
				Arrays.asList(new Item(2,"C",10,101)));
		inventory.put(
				new Warehouse("WH 3", "Binh Dinh"),
				Arrays.asList(new Item(3,"C",10,101)));
		return inventory;
	}
}
