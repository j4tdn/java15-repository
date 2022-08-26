package list;

import java.util.Arrays;
import java.util.List;

import bean.Item;

public class Ex04ObjectDataManipulation {
	public static void main(String[] args) {
		List<Item> items = getItems();
		
		// contains, remove
		// require --> override equals method
		Item itemX = new Item(1, "Item 1", 100, 1);
		boolean isExists = items.contains(itemX);
		items.remove(itemX);
		System.out.println("size: " + items.size());
		System.out.println("isExists:" + isExists);
	}
	
	private static List<Item> getItems() {
		Item item1 = new Item(1, "Item 1", 100, 1);
		Item item2 = new Item(2, "Item 2", 200, 1);
		Item item3 = new Item(3, "Item 3", 300, 2);
		Item item4 = new Item(4, "Item 4", 400, 2);
		
		// java.util.ArrayList --> dynamic size
		// java.util.Arrays.ArrayList --> fixed size, un-support add, remove
		return Arrays.asList(item1, item2, item3, item4);
	}
	
}
