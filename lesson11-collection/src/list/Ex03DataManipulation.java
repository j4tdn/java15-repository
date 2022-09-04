package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Ex03DataManipulation {
	public static void main(String[] args) {
		// add , remove , get , set , contains , size , iterate
		List<String> elements = new ArrayList<>();

		elements.add("A");
		elements.add("B");
		elements.add("C");
		elements.add("D");

		// elements.remove(1);
		// elements.remove("C");
		elements.removeIf(element -> element.compareTo("C") > 0);
	    System.out.println("is Exists : " + elements.contains("X"));
		System.out.println("size : " + elements.size());
		elements.forEach(v -> System.out.println("" + v));

		// iterator

	}

	private static void iterate(List<String> elements) {
		Iterator<String> each = elements.iterator();
		while (each.hasNext()) {
			String string = (String) each.next();
			// Strategy pattern 
			
			System.out.println(elements);
		}
	}
}
