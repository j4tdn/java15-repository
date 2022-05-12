package structure;

import bean.Item;

public class Ex06 {
	public static void main(String[] args) {
		//final - cannot update value at stack
		@SuppressWarnings("unused")
		final float PI = 3.14f;
		
		// wrong update
		// PI = 6.28f;
		
		// itemX là biến, new Item(123, "Item 123", 250) là 1 đối tượng
		final Item itemX = new Item(123, "Item 123", 250);
		System.out.println("ItemX address: " + System.identityHashCode(itemX));
		Item itemY = new Item(234, "Item 234", 360);
		System.out.println("ItemY address: " + System.identityHashCode(itemY));
		
		// Toán tử = hoạt động 100% ở trên stack
		// itemX = itemY;
		System.out.println("ItemX address: " + System.identityHashCode(itemX));
		
		itemX.name = "Update Item";
		System.out.println(itemX);
	}
}
