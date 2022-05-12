package structure;

import bean.Item;

public class Ex04 {
	public static void main(String[] args) {
		// Variable: age, price, letter, itemA
		// ==>> 100: Biến lưu trữ, nằm ở STACK
		
		// Value: 18, 22.250, 'X'
		// Primitive Type: Giá trị nằm ở STACK
		// Object: Giá trị nằm ở HEAP
		int age = 18;
		double price = 22.520;
		char letter = 'X';
		System.out.println("Age: " + age);
		System.out.println("Price: " + price);
		System.out.println("Letter: " + letter);

		// Object Type
		// new Item() ---> Khởi tạo đối tượng, ô nhớ ở HEAP để lưu trữ giá trị
		Item itemA = new Item();
		itemA.itemId = 123;
		itemA.name = "Laptop Lenovo X123";
		itemA.price = 2200;
		// Khi gọi, in ra biến KDL đối tượng thì tự động nó sẽ gọi hàm toString của class Object
		// Class Object: mặc định là cha của tất cả các class trong Java
		// toString: in ra giá trị, thông tin của đối tượng hiện tại
		// Nếu trong class Item định nghĩa - override lại hàm toString thì itemA, itemB sẽ gọi
		// toString trong class Item
		
		System.out.println("ItemA: " + itemA);
		// System.out.println("ItemA: " + itemA.toString());
		// Gọi hàm khởi tạo để khởi tạo đối tượng
		Item itemB = new Item();
		itemB.itemId = 234;
		itemB.name = "LG X234";
		itemB.price = 5200;
		System.out.println("ItemB: " + itemB);
		
		Item itemC = new Item(567, "IphoneX", 6000);
		System.out.println("Item-C: " + itemC);
		
	}
}
