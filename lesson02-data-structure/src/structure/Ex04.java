package structure;

import bean.Item;

public class Ex04 {

	public static void main (String[] args) {
		//Primitive Type
		int age = 18;
		double price = 22.520;
		char letter = 'X';
		System.out.println("Age: " + age);
		System.out.println("Price: " + price);
		System.out.println("Letter: " + letter);
		
		// object Type
		Item itemA = new Item();
		itemA.itemId = 123;
		itemA.name = "LAPTOP LENOVO X123";
		itemA.price = 2200;
		
		System.out.println("ItemA: " + itemA);
		//System.out.println("ItemA: " + itemA.toString());
	}
}
