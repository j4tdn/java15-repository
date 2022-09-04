package list;

import java.awt.ItemSelectable;
import java.util.Arrays;
import java.util.List;

import bean.Item;

public class Ex04ObjectDataManipulation {
	public static void main(String[] args) {
          List<Item> items = getItems();
        // items.add(new Item());
          
          // contains , remove 
          Item itemX = new Item(1, "Item 1", 100, 1);
          boolean isExists = items.contains(itemX);
         // items.remove(itemX);
          System.out.println("isExists :" + isExists);
          System.out.println("Size :" + items.size());
        
	}

	private static List<Item> getItems() {
		Item item1 = new Item(1, "Item 1", 100, 1);
		Item item2 = new Item(2, "Item 2", 200, 1);
		Item item3 = new Item(3, "Item 3", 300, 2);
		Item item4 = new Item(4, "Item 4", 400, 2);
        // java.util.ArrayList --> Dynamic size
		// java.util.Arrays.ArrayList -> fixed size 
		return Arrays.asList(item1, item2, item3, item4);
	}
}
