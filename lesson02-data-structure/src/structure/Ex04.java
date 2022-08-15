package structure;

import bean.Item;

public class Ex04 {
	public static void main(String[] args) {
		// Variables: age, price, letter, itemA 
		//  ==>> 100: Biến lưu trữ, nằm ở STACK
		
		// Values: 18, 22.520, 'X'
		//  ==>> Primitive: Giá trị sẽ nằm ở STACK
		//  ==>> Object: Giá trị sẽ nằm ở HEAP
		//             : Giá trị NULL là chưa khởi tạo ô nhớ, giá trị ở HEAP
		
		// Primitive Type
		int age = 18;
		double price = 22.520;
		char letter = 'X';
		System.out.println("Age: " + age);
		System.out.println("Price: " + price);
		System.out.println("Letter: " + letter);
		
		
		// Object Type
		// new Item() --> Khởi tạo đối tượng, ô nhớ ở HEAP để lưu trữ giá trị
		Item itemA = new Item();
		itemA.itemId = 123;
		itemA.name = "Laptop Lenovo X123";
		itemA.price = 2200;
		
		// Khi gọi, in ra biến KDL đối tượng thì tự động nó sẽ gọi
		// hàm toString của class 'Object'
		// Class Object: Mặc định là cha của tất cả các class trong Java
		//    toString: Giá trị, thông tin của đối tượng hiện tại
		
		// Nếu trong class Item định nghĩ - override lại hàm toString
		// Thì itemA itemB sẽ gọi toString trong class Item
		System.out.println("ItemA: " + itemA);

		// System.out.println("ItemA: " + itemA.toString());
		//  getClass().getName() + "@" + Integer.toHexString(hashCode())
		// Gọi hàm khởi tạo - constructor để khởi tạo đối tượng
		Item itemB = new Item();
		itemB.itemId = 234;
		itemB.name = "LG X234";
		itemB.price = 5200;
		System.out.println("ItemB: " + itemB);
		
		Item itemC = new Item(567, "Iphone X", 6000);
		System.out.println("Item-C: " + itemC);
		
		
	}
}
