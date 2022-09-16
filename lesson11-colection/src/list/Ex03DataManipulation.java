package list;

import java.util.List;
import java.util.ArrayList;

public class Ex03DataManipulation {

	public static void main(String[] args) {
		List<String> elements = new ArrayList<>();
		elements.add("A");
		elements.add("B");
		elements.add("C");
		elements.add("D");
		
		
		//elements.remove(1);
		//elements.remove("C");
		elements.removeIf(element -> element.compareTo("B")>0);
		System.out.println("is exists:" + elements.contains("X"));
		
		System.out.println("size: " + elements.size());
		for(String element: elements) {
			System.out.println(element);
		}
	}

}
