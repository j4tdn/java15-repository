package structure;

import bean.Item;

public class Ex04 {
    public static void main(String[] args) {
		// Primitive Type
    	int age = 18;
    	double price = 22.520;
    	char letter = 'X';
    	System.out.println("Age: " + age);
    	System.out.println("Price: " + price);
    	System.out.println("Letter: " + letter);
    	
    	// Object Type
    	Item itemA = new Item();
    	itemA.itemId = 123;
    	itemA.name = "LT X123";
    	itemA.price = 2200;
    	
    	
    	System.out.println("ItemA: " + itemA);
    	//System.out.println("ItemA: " + itemA.toString()); 
    	
    	Item itemB = new Item();
    	itemB.itemId = 234;
    	itemB.name = "LT x234";
    	itemB.price = 5200;
    	System.out.println("ItemB: " + itemB);
    	
    	Item itemC = new Item(567, "Iphone X", 6000);
    	System.out.println("Item-C: " + itemC);
	}
}
