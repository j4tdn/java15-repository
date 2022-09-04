package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import bean.Item;

public class Ex04_ObjectDataManipulation {
	public static void main(String[] args) {
		List<Item> items = getItems();
		
		//contains, remove
		Item itemX = new Item(1, "Item1", 100, 1);
		boolean isExists = items.contains(itemX);
		items.remove(itemX);
		System.out.println("size: " + items.size());
		System.out.println(isExists);
	}
	
	private static List<Item> getItems(){
		Item item1 = new Item(1, "Item1", 100, 1);
		Item item2 = new Item(2, "Item2", 200, 1);
		Item item3 = new Item(3, "Item3", 300, 2);
		Item item4 = new Item(4, "Item4", 400, 2);
		List<Item> items = new ArrayList<>();
		items.add(item1);
		items.add(item2);
		items.add(item3);
		items.add(item4);
		return items;
		//return Arrays.asList(item1, item2,item3, item4);
	}
}
