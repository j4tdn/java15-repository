package structure;

import bean.Item;

public class Ex03App {
	public static void main(String[] args) {
		int age = 18;
		double price = 22.520;
		char letter = 'X';
		System.out.println("Age: " + age);
		System.out.println("price: " + price);
		System.out.println("Letter: " + letter);

		// new Item()--> khoi tao doi tuong, o nho o heap de luu tru gia tri
		Item itemA = new Item();
		itemA.itemId = 234;
		itemA.name = "Laptop Asus X123";
		itemA.price = 5200;
		System.out.println("ItemA: " + itemA);
		Item itemB = new Item();
		itemB.name = "LG X234";
		System.out.println("ItemB: " + itemB);
		Item itemC = new Item(567, "Iphone X", 6000);
		System.out.println("Item-C " + itemC); 

	}

}
