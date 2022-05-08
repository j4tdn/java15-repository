package structure;

import bean.Item;

public class Ex04 {
	public static void main(String[] args) {
		//Primitive Type
		int age = 18;
		double price = 22.482;
		char letter = 'X';
		System.out.println("Age: "+age);
		System.out.println("Price: "+price);
		System.out.println("Letter: "+letter);
		//Object Type
		Item itemA = new Item();
		itemA.itemId = 123;
		itemA.name = "Laptop Asus";
		itemA.price = 2200;
		
		//Item itemA = null;
		System.out.println("ItemA: "+ itemA);
		//System.out.println("ItemA: "+ itemA.toString());
		
	}
}
