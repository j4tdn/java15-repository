package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Ex03DataManipulation {
	public static void main(String[] args) {
		List<String> elements = new ArrayList<>();
		elements.add("A");
		elements.add("B");
		elements.add("C");
		elements.add("D");
		
		//elemntes.remove;
		elements.remove("C");
		elements.removeIf(element -> element.compareTo("B") > 0);
		System.out.println("is exist: " + elements.contains("X"));
		
		System.out.println("size: " +elements.size());
		System.out.println(elements);
		
		//iterator 
		Iterator<String> each = elements.iterator();
	}
	
	private static void iterate(List<String> elements) {
		Iterator<String> each = elements.iterator();
		while(each.hasNext()) {
			String element = each.next();
			System.out.println(element);
		}
	}
}
