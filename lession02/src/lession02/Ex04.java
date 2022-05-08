package lession02;

import bean.Item;

public class Ex04 {
	public static void main(String[] args) {
		int age =18;
		double price =22.520;
		char letter = 'X';
		
		System.out.println("Age = " + age);
		System.out.println("P = " + price);
		System.out.println("L = " + letter );
		
		Item itemA = new Item();
		itemA.itemId = 123;
		itemA.name = "Phan Thi Kim Anh";
		itemA.price = 1804;		
		 
		Item itemBItem = new Item();
		itemB.itemId = 123456;
		itemB.name = "Phuong Phuong";
		itemB.price = 3112;
		
		Item itemC = new Item(567, " iphone X",6000) {
			System.out.println("");
		}
		
	//	Item  itemA = null;
		System.out.println("Item A= " + itemA);
	}
	
}
