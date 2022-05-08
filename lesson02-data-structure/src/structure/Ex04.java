package structure;

import bean.Item;

public class Ex04 {
	public static void main(String[] args) {
		int age = 18;
		double price = 22.520;
		char letter = 'X';
		System.out.println("Age: " + age);
		System.out.println("Price: " + price);
		System.out.println("Letter: " + letter);
		
		Item ItemA = new Item(age, null, price);
		System.out.println("ItemA: " + ItemA.toString());
	
	}
}
