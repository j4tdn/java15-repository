package structure;

import bean.Item;

public class Ex06 {
	public static void main(String[] args) {
		final float PI = 3.14f;
		
		
		//PI = 6.28f;
		
		Item itemX = new Item(123, "Item 123", 250);
		System.out.println("ItemX address: "+System.identityHashCode(itemX));
		
		Item itemY = new Item(234, "Item 234", 360);
		System.out.println("ItemX address: "+System.identityHashCode(itemY));
//		itemX = itemY;
		System.out.println("ItemX address: "+System.identityHashCode(itemX));
		itemX.name = "updeta Item";
		System.out.println(itemX);

		
		
		
		

	}
}
