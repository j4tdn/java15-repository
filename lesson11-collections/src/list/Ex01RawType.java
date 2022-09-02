package list;

import java.util.ArrayList;
import java.util.List;

public class Ex01RawType {
	public static void main(String[] args) {
		// raw type --> valid at prior Java 1.4
		List list = new ArrayList<>();
		
		// list of number
		list.add(1);
		list.add(2);
		list.add(3);
		list.add("Hello");
		list.add(3d);
		list.add(true);
		list.add(null);
		
		// double list of numbers
		for(int i = 0; i < list.size(); i++) {
			// looks good at compile
			System.out.println((int)list.get(i) * 2);
		}
		// throw error at runtime
		// never use raw type
		
	}
}
