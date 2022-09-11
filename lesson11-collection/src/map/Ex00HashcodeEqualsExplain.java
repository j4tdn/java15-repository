package map;

import bean.Item;

public class Ex00HashcodeEqualsExplain {
	public static void main(String[] args) {

		Item item = new Item(0, "item 1", 100, 101);
		System.out.println(System.identityHashCode(item));
		System.out.println(item.hashCode());
		Item item2 = new Item(1, "item 1", 100, 011);
	}

}
