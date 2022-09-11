package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		//HashSet: 		 unique, unordered, unsorted
		//TreeSet: 		 unique, 			, sorted Set<E extends Comparable<E> 
		//LinkedHashSet: unique, order , unsorted
		
		//Set<String> items = new HashSet<>();
		//Set<String> items = new TreeSet<>();
		Set<String> items = new LinkedHashSet<>();
		
		items.add("Item 7");
		items.add("Item 22");
		items.add("Item 14");
		items.add("Item 33");
		
		print(items);
	}
	
	private static void print(Set<String> set) {
		for(String item: set) {
			System.out.println(item);
		}
	}
}
