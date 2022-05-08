package structure;

import bean.Item;

public class Ex06 {
	public static void main(String[] args) {
		//final --> cannot update value at STACK
		final float PI = 3.14f;
		
		//wrong update
		//PI = 6.28f;
	
	final Item itemX = new Item(123, "Item 123", 250);
	System.out.println("Item address: " + System.identityHashCode(itemX));
	
	Item itemY = new Item(234, "Item 234", 360);
	System.out.println("Item address: " + System.identityHashCode(itemY));
	
	//itemX = itemY;
	System.out.println("Item address: " + System.identityHashCode(itemX));
	
	itemX.name = "Update Item";
	System.out.println(itemX);

	}

}
