package structure;

import bean.Item;

public class Ex04 {
	public static void main(String[] args) {
		// Primitive Tpe
		int age = 18;
		double price = 22.520;
		char letter = 'X';
		System.out.println("Age: " + age);
		System.out.println("Price: " + price);
		System.out.println("Letter: " + letter);
		

		// Object Type
		Item itemA = new Item();
		itemA.itemId = 123;
		itemA.name = "Laptop Lenovo X123";
		itemA.price = 2200;
		
		System.out.println("ItemA: " + itemA);
		// System.out.println("ItemA: " + itemA.toString());
		Item itemB = new Item();
		itemB.name = "LG X234";
		
		
		System.out.println("ItemB: " + itemB);
		Item itemC = new Item(567, "Iphone X", 6000);
		System.out.println("Item-C: " + itemC);
		
	
		

	}

}
