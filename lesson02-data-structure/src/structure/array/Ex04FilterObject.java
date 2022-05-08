package structure.array;

import java.util.Arrays;

import beans.Item;

public class Ex04FilterObject {
	public static void main(String[] args) {
		Item itemA= new Item(123,"Item123",720);
		Item itemB= new Item(123,"Item123",199);
		Item itemC= new Item(123,"Item99",220);
		Item[] items= {itemA,itemB,itemC};
		
		System.out.println(Arrays.toString(findCost(items)));
	}
	private static Item[] findCost(Item[] items) {
		Item[] result = new Item[items.length];
		int count=0;
		for(Item item:items) {
			if(item.getPrice()>200) {
				result[count]=item;
				count++;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	
}