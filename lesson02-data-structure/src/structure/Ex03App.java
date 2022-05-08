package structure;

import bean.Item;

public class Ex03App {
	public static void main(String[] args) {
		// Variables: age, price, letter, itemA: biến nguyên thủy
		// ==>> 100: Biến lưu trữ, nằm ở STACK
		
		//Values: 18, 22.520, 'X' 
		// ==> Primiti: giá trị sẽ nằm ở STACK
		// ==> Object: Gía trị sẽ nằm ở HEAP
		//			 : Gía trị null là chưa khởi tạo ô nhớ, hay giá trị ở HEAP
		
		
		// primitive Type
		int age = 18;
		double price = 22.520;
		char letter = 'x';
		System.out.println("Age: " + age);
		System.out.println("Price: " + price);
		System.out.println("Letter: " + letter);
		
		//Object Type
		// new Item() --> Khởi tạo đối tượng, ô nhớ ở HEAP để lưu trữ giá trị
		
		Item itemA = new Item();
		itemA.itemID = 123;
		itemA.name = "Laptop Lenovo X123";
		itemA.price = 2200;
		
		// Mặc định: khi gọi, in ra biến KDL đối tượng thì tự động nó sẽ gọi là
		// toString của class 'Object'
		// class object : mặc định là cha của tất cả các class trong java
		System.out.println("ItemA: " + itemA);
		
		Item itemB = new Item();
		itemB.itemID =  234;
		itemB.name = "LG X234";
		itemB.price = 5200;
		System.out.println("ItemB: " + itemB);
		
		Item itemC = new Item (567, "Iphone X", 6000);
		System.out.println("Item-C: " + itemC);
	}
}
