package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		// HashSet		 : unique, unoder, unsorted,
		// TreeSet		 : unique        , sorted Set<E extends Comparable<E>
		// LinkedHashSet : unique, order, sorted
		Set<String> items = new TreeSet<String>();
		items.add("Item 7");
		items.add("Item 22");
		items.add("Item 14");
		items.add("Item 33");
		items.add("Item 22"); // auto remove duplicate values
		
		print(items);
		
		// Set<E>
		// + Map<E, Object>
		// + add(E, e) --> map.put(e, PRESENT)
	}
	
	private static void print(Set<String> set) {
		for(String item : set) {
			System.out.println(item);
		}
	}
}
