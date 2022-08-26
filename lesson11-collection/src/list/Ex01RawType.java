package list;

import java.util.ArrayList;
import java.util.List;

public class Ex01RawType {
	public static void main(String[] args) {
		// raw type --> type at prior Java 1.4
		List list = new ArrayList();
		
		// list of number
		list.add(1);
		list.add(2);
		list.add("hello");
		list.add(3d);
		list.add(true);
		
		// double list of numbers
		for(int i = 0; i < list.size(); i++) {
			System.out.println((int)list.get(i) * 2);
		}
		
		// throw error at runtime
		// never use raw type
	}
}
