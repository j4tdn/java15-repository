package structure.array;

import java.util.Arrays;

import bean.Item;

public class Ex04FilterObject {
	public static void main(String[] args) {
		Item itemA = new Item (123, "Item 123", 720);
		Item itemB = new Item (123, "Item 234", 260);
		Item itemC = new Item (123, "Item 345", 100);
		Item[] items = {itemA, itemB, itemC};
		Item[] price = filter(items);
		System.out.println(items);


	}
	//Tìm những mặc hàng có giá lớn hơn 200

	private static Item[] filter(Item[]item) {
		Item[] result = new Item[item.length];
		int count = 0;
		for(Item items: item) {
		
		if(item price() > 200);
		{
			result[count] = items;
			count ++;
			}
		return Arrays.copyOfRange(result, 0, count);
	}
	}
}
	
