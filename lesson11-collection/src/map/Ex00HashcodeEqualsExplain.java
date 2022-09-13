package map;

import bean.Item;

public class Ex00HashcodeEqualsExplain {
	public static void main(String[] args) {

		
		
		Item item1 = new Item(1, "Item 1", 100, 101 );
		
		System.out.println(System.identityHashCode(item1));
		System.out.println(item1.hashCode());
		
		Item item2 = new Item(1, "Item 1", 100, 101 );
		System.out.println(item1.equals(item2));

	}
}
