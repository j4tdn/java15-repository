package map;

import bean.Item;

public class Ex00HashcodeEqualExplain {
	public static void main(String[] args) {
		Item item1 = new Item(1,"Item 1",100,101);
		
		System.out.println(System.identityHashCode(item1));
	}

}
