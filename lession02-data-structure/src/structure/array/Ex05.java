package structure.array;

import java.util.Arrays;

import bean.Item;

public class Ex05 {
	public static void main(String[] args) {
		Item itemA = new Item(1, "Item1", 100);
		Item itemB = new Item(2, "Item2", 200);
		Item itemC = new Item(3, "Item2", 400);
		Item[] items = { itemA, itemB, itemC};
		Item[] name = findName(items);
		for(Item a : name) {
			System.out.println(a);
		}
		System.out.println(Arrays.toString(name));

		
	}
	public static Item[] findName(Item[] item){
		int dem = 0;
		Item[] result = new Item[item.length];
		for(Item element:item) {
			if(element.name == "Item2")
			{
				result[dem] = element;
				dem++;
			}
		}
		return Arrays.copyOfRange(result, 0, dem);
	}
}
