package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Ex03DataManipulation {

	public static <T> void main(String[] args) {
		List<String> elements = new ArrayList<>();
		//add, remove , get ,set, contains, size, iterate(duyệt)
		
		elements.add("A");
		elements.add("B");
		elements.add("C");
		elements.add("D");
		
//		elements.remove(1);
//		elements.remove("C");
//		elements.removeIf(new Predicate<String>() {
//
//			@Override
//			public boolean test(String element) {
//				
//				return element.compareTo("B");
//			}
//		});
//		elements.removeIf(element -> elements.compareTo("B") > 0);
		System.out.println("is exists: " + elements.contains("X"));
		
		System.out.println("size: " + elements.size());
		
		System.out.println(elements);
		
	}
	
	private static void iterate(List<String> elements) {
		Iterator<String> each = elements.iterator();
		while (each.hasNext()) {
			String element =  each.next();
			// starregy pattern : tạo một cái interface, hàm trừu tượng quuan tâm đến tham số truyền vào 
			
			System.out.println(element);
		}
	}

}
