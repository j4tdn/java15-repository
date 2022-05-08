package structure.array;
import bean.Item;
import java.util.Arrays;
public class Ex04FilterObject {
	public static void main(String[] args) {
		Item itemA = new Item(123, "Item 123", 720);
		Item itemB = new Item(234, "Item 234", 260);
		Item itemC = new Item(345, "Item 345", 100);
		Item[] items = {
			   itemA, itemB, itemC, };
		
		Item[] result = filter(items);
		for (Item item: result) {
			System.out.println(item);
		}
	}
	// tim nhung mat hang co gia lon hon 200
	private static Item[] filter(Item[] items) {
		Item[] result = new Item[items.length];
		int count = 0;
		for (Item item: items) {
			if (item.price > 200) {
				result[count] = item;
				count++;
			}
			
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
}
