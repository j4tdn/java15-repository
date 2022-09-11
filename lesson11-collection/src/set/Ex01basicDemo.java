package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex01basicDemo {

	public static void main(String[] args) {
		// HashSet: unodered , unsorted, unique
		// TreeSet: unique, sorted Set<E extend Comparable<E>>
		// LinkdHashSet: unique, sorted
		Set<String> items = new LinkedHashSet<>();
		items.add("Item 7");
		items.add("Item 22");
		items.add("Item 14");
		items.add("Item 33");
		items.add("Item 22"); // auto remove dupcate values
		print(items);
		// khi map.put success --> set.add success
	}
	private static void print(Set<String> set) {
		for(String item : set) {
			System.out.println(item);
		}
	}

}
