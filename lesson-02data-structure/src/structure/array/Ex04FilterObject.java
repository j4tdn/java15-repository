package structure.array;

import java.lang.reflect.Array;
import java.util.Arrays;

import bean.Item;

public class Ex04FilterObject {
public static void main(String[] args) {
	Item itemA = new Item(123, "Item123", 720);
	Item itemB = new Item(234, "item 234", 260);
	Item itemC = new Item(345, "Item345", 120);
	Item[] items ={ itemA, itemB, itemC };
Item[] result = filter(items);
for (Item item : result) {
	System.out.println(item);
}
}
public static Item[] filter(Item[] items) {
	Item[] result = new Item[items.length];
	int count = 0;
	for (Item  item: items) {
		if(item.price > 200) {
			result[count] = item;
			count++;
		}
	}
	return Arrays.copyOfRange(result, 0, count);
}
}
