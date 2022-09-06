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
		
		
		//elements.remove(1);
		elements.remove("C");
		
		//elements.removeIf()
		
		System.out.println("size: " + elements.size() );
		System.out.println(elements);
		elements.removeIf(element -> element.compareTo("B")>0);
		System.out.println(elements);
		System.out.println("is exists: " + elements.contains("X") );
		
	}
	private static void iterate(List<String > elements) {
		  Iterator<String> each = elements.iterator();
		while(each.hasNext()) {
			
		}
	}
	
	

}
