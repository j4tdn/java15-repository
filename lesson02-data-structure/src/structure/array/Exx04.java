package structure.array;
import java.util.Arrays;
import bean.Item;
public class Exx04 {
	public static void main(String[] args) {
		 		Item itemA = new Item(123,"Item 123",720);
				Item itemB = new Item(123,"Item 123",260);
				Item itemC = new Item(123,"Item 123",100);
	Item[] items = {
			itemA,
			itemB,
			itemC,
			
	};
	Item[] result = filter(items);
	for(Item item: result) {
		System.out.println(item);
		}
	}
	// timf nhuwngx mawtj hangf cos gias lowns hown 200
	private static Item[] filter(Item[] items) {// em ko hiểu cấu trúc của cấy ni
		Item[] result = new Item[items.length];
		int cout = 0;
		for (Item item: items) {
			if(item.price > 200) {
				result[cout] = item;
				cout ++;
			}
		}
		return Arrays.copyOfRange(result, 0, cout);
	
	}

}
