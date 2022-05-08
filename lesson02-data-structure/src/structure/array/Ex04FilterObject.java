package structure.array;

import bean.Item;
import java.lang.reflect.Array;
import java.util.Arrays;

import bean.Item;

public class Ex04FilterObject {
	public static void main(String[] args) {
		Item itemA = new Item(123, "Item 123", 720);
		Item itemB = new Item(234, "Item 234", 3324);
		Item itemC = new Item(345, "Item 345", 34324);
		Item[] items = { itemA, itemB, itemC};
		Item[] result = test(items);
		System.out.println(Arrays.toString(result));
	}
	// tìm những mặt hàng có giá lớn hơn 200
	
	private static Item[] test(Item[] items){	
		Item[] result= new Item[items.length];
		int count = 0;
		for(Item i : items) {
			if(i.price < 200) {
				result[count++]= i;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
}
