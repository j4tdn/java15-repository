package structure;

import bean.Item;

public class Ex06 {
	public static void main(String[] args) {
		// final -> cannot update value at STACK
		final float PI = 3.14f;

		// wrong update PI=6.28f\

		// PI=6.28f; // error

		final Item itemX = new Item(123, "Item 123", 250);
		System.out.println("ItemX address:" + System.identityHashCode(itemX));
		Item itemY = new Item(234, "Item 234", 360);
		System.out.println("ItemY address:" + System.identityHashCode(itemY));
		
		//itemX=itemY;// toán tử = hoạt động 100% trên STACK
		System.out.println("ItemX address:" + System.identityHashCode(itemX) );
		System.out.println("ItemY address:" + System.identityHashCode(itemY) );
		itemX.name="Update Item";
		System.out.println("ItemX: "+ itemX);

	}

}
