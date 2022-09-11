package list;

import java.util.Arrays;
import java.util.List;

import bean.*;

public class Ex04ObjectDataManipulation {
	public static void main(String[] args) {
		List<Item> items = getItems();

		// contain, remove
		// require --> overide equals method
		Item itemX = new Item(1, "Item 11", 111, 1);
		boolean isExits = items.contains(itemX);
		System.out.println("is Exits:" + isExits);

		System.out.println("size:" + items.size());

	}

	private static List<Item> getItems() {
		Item item1 = new Item(1, "Item 1", 100, 1);
		Item item2 = new Item(2, "Item 2", 100, 1);
		Item item3 = new Item(3, "Item 3", 100, 1);
		Item item4 = new Item(4, "Item 4", 100, 1);
		// java.util.ArrayList-> dynamic size
		// java.util.Arrays.ArrayList-> fixed size, unsupport add remove
		return Arrays.asList(item1, item2, item3, item4);
	}
}
