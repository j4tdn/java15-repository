package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex01BasicDemo {
    public static void main(String[] args) {
    	// HashSet : Unorder , Unsorted , no-duplicate
    	// TreeSet : unique ,  sorted
		Set<String> items = new HashSet<>();
		items.add("Item 7");
		items.add("Item 22");
		items.add("Item 14");
		items.add("Item 33");
		items.add("Item 22"); // auto remove duplicate values
		print(items);
		
		// Set<E>
		// + Map<E , Object>
		// + add (E , e ) --> map.put(e , PRESENT ) ==> null ( true )
		// .put success --> .add success
	}
    private static void print(Set<String> set) {
    	for (String item : set) {
			System.out.println(item);
		}
    }
}
