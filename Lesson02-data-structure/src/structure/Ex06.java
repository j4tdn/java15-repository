package structure;

import bean.Item;

public class Ex06 {

	public static void main(String[] args) {
		// final --> cannot update value at STACK
		final float PI = 3.14f;
		// wrong update
		// PI = 6.28f;
		final Item itemX = new Item(123, "Item123", 250);
		System.out.println("ItemX address: " + System.identityHashCode(itemX));
		Item itemY = new Item(234, "Item 234", 360);
		System.out.println("ItemY address: " + System.identityHashCode(itemY));

		// itemY va itemX la bien dang thuoc kieu du lieu
		// doi tuong la new Item();
		// itemX = itemY;
		// toan tu "=" hoat dong 100% tren stack
		System.out.println("ItemX address: " + System.identityHashCode(itemX));
        // khi dung final o stack thi k dung duoc toan tu = o stack
		itemX.Name = "Updated Item";
		System.out.println(itemX);

	}

}
