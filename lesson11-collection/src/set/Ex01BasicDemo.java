package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import bean.Item;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		// HashSet:unique,unorder, unsorted
		//TreeSet:unique,sorted, Set<E extends Comparable<E>
		//LinkedHashset: unique, order, unsorted
		Set<String> items = new HashSet<>();
		items.add("Item 7");
		items.add("Item 22");
		items.add("Item 14");
		items.add("Item 33");
		items.add("Item 22");// auto remove duplicate values
		
		print(items);
		//Set<E>
		//+Map<E,Object>
		//+add(E,e)->map.put(e.PRESENT)==null
		//when map.put success -> set.add success
		//E --> overide
		
		
	}

	private static void print(Set<String> set) {
		for (String item : set) {
			System.out.println(item);
		}
	}
}
