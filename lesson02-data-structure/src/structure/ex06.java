package structure;

import java.awt.event.ItemEvent;

public class ex06 {
public static void main(String[]args) {
		//final --> cannot update value at STACK
		float PI = 3.14f;

		//wrong update
		//PI = 6.28f;
		
		final Item itemX = new Item(123, "222",222);
		System.out.println("ItemX addres:" + System.identityHashCode(itemX));
		Item itemY = new Item(234, "Item234",211);
		System.out.println("ItemY addres:" + System.identityHashCode(itemY));
		itemX = itemY;
		System.out.println("Item X address:"+ System.identityHashCode(itemX));
		itemX.name = "Update Item";
		System.out.println(itemX);
		
	}
}