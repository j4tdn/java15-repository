package structure;

import bean.Item;

public class Ex03App {
	public static void main(String[] args) {
		// Primitive Type
		int age = 18;
		double price = 22.520;
		char letter = 'X';
		System.out.println("Age: " + age);
		System.out.println("Price: " + price);
		System.out.println("Letter: " + letter);

		Item itemA = new Item();
		itemA.ItemId = 10;
		itemA.price = (int) 2200;
		itemA.name = "Laptop Lenovo 123";
		System.out.println("itemA: " + itemA);

		Item ItemB = new Item();
		ItemB.name = "LG 1234";
		System.out.println("itemB: " + ItemB);

		Item itemC = new Item(567, "IphoneX", 343456);
		System.out.println("itemC: " + itemC);
	}

}
