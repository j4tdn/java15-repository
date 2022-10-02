package set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		//HashSet: unique, unordered, unsorted
		//TreeSet: unique, 			, sorted
		//LinkedHashSet: unique, order, unsorted
		Set<String> items = new HashSet<>();
		items.add("Item 7");
		items.add("Item 22");
		items.add("Item 14");
		items.add("Item 33");
		items.add("Item 22");
		
		print(items);
	}
	
	private static void print(Set<String> set) {
		for(String item: set) {
			System.out.println(item);
		}
	}
}
