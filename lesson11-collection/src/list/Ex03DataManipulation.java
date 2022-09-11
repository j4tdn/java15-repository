package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex03DataManipulation {
	public static void main(String[] args) {
		// add remove get set contains size interate
		List<String> elements = new ArrayList<>();
		elements.add("A");
		elements.add("B");
		elements.add("C");
		elements.add("D");

		//elements.remove(1);
		//elements.remove("C");
		elements.removeIf(element->element.compareTo("B")>0);
		System.out.println("is exits: "+ elements.contains("X"));
		

		System.out.println("size: " + elements.size());
		System.out.println(elements);
		//interator()
		
		
	}
	private static void interate(List<String> elements) {
		Iterator<String> each= elements.iterator();
		while (each.hasNext()) {
			String element=each.next();
			System.out.println(element);
		}
	}
}
