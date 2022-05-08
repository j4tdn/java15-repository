package structure;

import bean.Item;

public class Ex04 {
	public static void main(String[] args) {
		//Primitive Type
		int age = 18;
		double price = 22.520;
		char letter = 'X';
		System.out.println("Age: "+ age);
		System.out.println("Price: "+ price);
		System.out.println("Letter: "+ letter);
		
		
		// Object Type
		// new Item() --> khởi tạo đối tượng, ô nhớ ở HEAP để lưu trữ gía trị
		Item itemA = new Item();
		itemA.itemId = 123;
		itemA.name = "Laptop Lenovo X123";
		itemA.price = 2200;
	
		//Khi gọi, in ra biến KDL đối tượng thì tự động nó sẽ 
		//gọi hàm toString của class "Object"
		// Class Object: mặc định là cha của tất cả các class trong java
		// toString: giá trị, thông tin của đối tượng hiện tại
		System.out.println("ItemA: " + itemA);
		
		Item itemB = new Item();
		itemB.name = "LG X234";
		System.out.println("ItemB: "+ itemB);
		
		Item itemC = new Item(567, "Iphone X", 6000);
		System.out.println("ItemC: " + itemC);
		
		//System.out.println("ItemA: " + itemA.toString());
		
	}
}
