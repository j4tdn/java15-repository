package structure;

import bean.Item;

public class Ex06 {
	public static void main(String[] args) {
		final float PI = 3.14f;
		
		Item ItemX = new Item(123, "Item 123", 250);
		System.out.println("Item Address: " + System.identityHashCode(ItemX));
		
		Item ItemY = new Item(456, "Item 456", 650);
		System.out.println("Item Address: " + System.identityHashCode(ItemY));
		
		ItemX = ItemY;
		
		System.out.println("Item Address: " + System.identityHashCode(ItemX));
		
		ItemX.name = "Update Item ";
		System.out.println(ItemX);
	}
}
