package structure;

import bean.Item;

public class Ex04 {
	public static void main(String[] args) {
		//Primitive Type
		int age = 18;
		double price = 22.520;
		char letter = 'X';
		System.out.println("Age:" + age);
		System.out.println("Price: " + price);
		System.out.println("Letter: " + letter);
		
		//Object Type
		Item itemA = new Item();
		itemA.itemId = 200;
		itemA.name = "helo";
		itemA.price = 200.122;
		
		Item itemB = new Item();
		itemB.itemId = 222;
		itemB.name = "hayo";
		itemB.price = 22.222;
		System.out.println("mlem: " + itemA);
		System.out.println("mlem: " + itemB);
	}
}
