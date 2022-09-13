package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import bean.Item;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		Set<String> items = new LinkedHashSet<>();
		items.add("Item 7");
		items.add("Item 22");
		items.add("Items 14");
		items.add("Item 33");
		print(items);

		Set<Item> itemsXXX = new TreeSet<>();
	}

	private static void print(Set<String> set) {

		for (String item : set) {
			System.out.println(item);
		}
	}
}
