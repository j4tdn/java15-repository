package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex03DataManipulation {
	public static void main(String[] args) {
		List<String> elements = new ArrayList<>();
		
		//add, remove, get, set, contains, size, iterate
		
		elements.add("A");
		elements.add("B");
		elements.add("C");
		elements.add("D");
		elements.add("E");
		
		elements.remove(1);
		elements.remove("C");

		System.out.println("size: " + elements.size());
		
//		for(String element : elements) {
//			System.out.println(element);
//		}
		System.out.println(elements);
		
		
		elements.removeIf(element --> element.compareTo("B") > 0);
		
		System.out.println("is exists: " + elements.contains("A"));
	}
		private static void iterate(List<String> elements) {
			Iterator<String> each = elements.iterator();
			while(each.hasNext()) {
				String element =  each.next();
				System.out.println(element);
			}
		}
	
}























































