package structure;

import bean.Item;

public class Ex06 {
	public static void main(String[] args) {
		final float PI = 3.14f;
	//	final --> khong the cap nhat du lieu o stack
		//wrong update
		//PI = 6.28f;
		
		final Item itemX = new Item(123, "Item 123", 250);
		System.out.println("ItemX addr : " + System.identityHashCode(itemX));

		Item itemY = new Item(234, "Item 234", 360);
		System.out.println("ItemX addr : " + System.identityHashCode(itemY));
		//itemX = itemY;
		System.out.println("ItemX addr : " + System.identityHashCode(itemX));
		itemX.name = "Update";
		System.out.println(itemX);
		

	   // itemX.ItemId = 123;
		
	}
}
