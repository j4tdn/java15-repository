package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex01BsicDemo {
	public static void main(String[] args) {
		
		//hashset: no-duplicate, unsorted, unorder.
		//Treeset:un-duplicate(unique),  sorted Set<E extends comparable<E>>
		//LinkHashSet: unique, 
		Set<String> item  = new HashSet<>();
		item.add("item 7");
		item.add("item 22");
		item.add("item 14");
		item.add("item 33");
		item.add("item 9");
		
		print(item);
	}
	private static void print(Set<String> set) {
		for(String element : set) {
			System.out.println(element);
		}
	}
}
