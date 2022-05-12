package structure;

import bean.Item;

public class Ex04 {
	public static void main(String[] args) {
		
		int age = 18;
		double price = 22.520d;
		char letter = 'X';
		System.out.println("Age: " + age);
		System.out.println(price);
		System.out.println(letter);
		
		Item itemA = new Item();
		itemA.itemId = 123;
		itemA.name ="laptop";
		itemA.price = 2200 ;
		
		
		System.out.println(itemA);
		//System.out.println("ItemA: "+ itemA.toString());
		Item itemB =new Item();
		itemB.itemId=234;
		itemB.name ="LG";
		itemB.price=5200;
		System.out.println("ItemB:"+itemB);
		
		Item itemC = new Item(567,"Iphone X",6000);
		System.out.println("ItemC: "+itemC);
		
	}
}
