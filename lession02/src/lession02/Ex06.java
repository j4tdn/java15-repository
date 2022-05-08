package lession02;

import bean.Item;

public class Ex06 {
	
	// Bieens nawmf owr ddaay ddupwjc dungf trong toanf class
	
	

	public static void main(String[] args) {
		
		// bieens nawnfm owr ddaay dungf trong hamf
		//final
		float PI = 3.14f;
		// final --> khoong theer update duwx lieeuj owr stack
		
		PI= 6.28f;
		 final Item itemX = new Item(123,"Item 123", 250);
		//   Biến      Doi tuong   
		Item itemY = new Item(234, "Item 234", 360);
//		System.out.println("ItemX address"+ System.identityHashCode(itemX) );
//		System.out.println("ItemY address"+ System.identityHashCode(itemY) );
		//itemX = itemY;
		System.out.println("ItemX address"+ System.identityHashCode(itemX) );
		System.out.println("ItemY address"+ System.identityHashCode(itemY) );
		
		itemX.name = "anh nho em";
		System.out.println(itemX);
		
	}

}
