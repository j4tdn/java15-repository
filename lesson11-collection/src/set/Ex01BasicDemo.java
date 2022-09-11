package set;


import java.util.LinkedHashSet;
import java.util.Set;


public class Ex01BasicDemo {
	public static void main(String[] args) {
		
		Set<String> items = new LinkedHashSet<>();
		items.add("item 7");
		items.add("item 22");
		items.add("item 14");
		items.add("item 33");
		items.add("item 22");
	 printf(items);
	}
private static void printf(Set<String> set) {
	for( String item : set ) {
		System.out.println(item);
	}
}
}
