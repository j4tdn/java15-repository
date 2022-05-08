package structure.array;

import java.util.Arrays;

import bean.Item;

public class Ex04FilterObject {
	public static void main(String[] args) {
		Item[] items = {
				new Item(123, "Item 123", 720), 
				new Item(234, "Item 234", 260), 
				new Item(345, "Item 345", 100),
				new Item(678, "Item 678", 201)
		};
		
		// Tim nhung mat hang co gia lon hon 200
		System.out.println(Arrays.toString(filterMaxPrice(items, 200)));
	}
	
	private static Item[] filterMaxPrice(Item[] items, int maxPrice) {
		Item[] result = new Item[items.length];
		int count = 0;
		for(Item item: items) {
			if(item.getPrice() > maxPrice) {
				result[count] = item;
				count++;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
}
