package structure;
import bean.Item;

public class Ex03App {
	public static void main(String[] args) {
		int age = 18;
		double price = 22.520;
		char letter = 'X';
		System.out.println("Age: " + age);
		System.out.println("Price: " + price);
		System.out.println("Letter: "+ letter);
		Item itemA = new Item(123, "laptop", 5.6);
//		itemA.itemId = 123;
//		itemA.name = "Laptop";
//		itemA.price = 22.56;
		System.out.println("ItemA: "+ itemA);
		System.out.println("ItemA: " + itemA.toString());
//		Item itemB = new Item();
//		itemB.itemId = 234;
//		itemB.name = "LG 565";
//		itemB.price =5200;
//		System.out.println("ItemB; " + itemB);
//		Item ItemC = new Item(567, Iphone X, 6000);
//		System.out.println("ItemC: "+ itemC);
		
	}

}
