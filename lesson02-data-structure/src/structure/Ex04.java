package structure;

import bean.Item;

public class Ex04 {
	public static void main(String[] args) {
		int age = 18;
		double price = 22.520;
		char letter = 'X';
		System.out.println("Age: " + age);
		System.out.println("Price: " + price);
		System.out.println("Letter " + letter);

		Item itemA = new Item();
		itemA.itemId = 123;
		itemA.name = "Laptop Lennovo X123";
		itemA.price = 2200;
		System.out.println("ItemA: " + itemA);
		Item itemB = new Item();
		itemB.name = "LG X234";
		System.out.println("ItemB: " + itemB);
		Item itemC = new Item(567,"iphoneX",6000);
		System.out.println("Item-C: " +itemC);
		
	}
}
