package structure;

import bean.Item;

public class Ex04App {
	public static void main(String[] args) {
		// Primitive Type - Kiểu Nguyên Thủy
		int age = 20;
		double price = 22.520;
		char letter = 'X';
		System.out.println("Age: " + age);
		System.out.println("Price: " + price);
		System.out.println("Letter: " + letter);

		// Object Type - Kiểu đối tượng
		// new Item() ==> Khởi tạo đối tượng, ô nhớ ở HEAP để lưu trữ giá trị
		// Class Object là cha của tất cả class trong java

		Item itemA = new Item();
		itemA.itemID = 1;
		itemA.name = "Chicken";
		itemA.price = 15000;

		System.out.println("ItemA: " + itemA);
		System.out.println("ItemA: " + itemA.toString());
		Item itemB = new Item();
		itemB.itemID = 2;
		itemB.name = "Duck";
		itemB.price = 9000;
		System.out.println("ItemB  " + itemB);
		
		Item ItemC=new Item( 3,"Beep ", 4000);
		System.out.println(("ItemC  " + ItemC));
		
	}

}
