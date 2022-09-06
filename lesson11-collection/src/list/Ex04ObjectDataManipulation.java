package list;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import bean.Item;
public class Ex04ObjectDataManipulation {
	public static void main(String[] args) {
	List<Item> items= getItems();
	Item itemX = new Item(1,"Item",100,1);
	boolean isExists = items.contains(itemX);
	System.out.println("isExists:" + isExists);
		
	}
	private static List<Item> getItems(){
		Item item1 = new Item(1, "Item1", 100, 1);
		Item item2 = new Item(2, "Item2", 200, 1);
		Item item3 = new Item(3, "Item3", 300, 2);
		Item item4 = new Item(4, "Item4", 400, 2);
		return Arrays.asList(item1, item2,item3,item4);
	}

}
