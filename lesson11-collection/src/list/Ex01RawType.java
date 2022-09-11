package list;

import java.util.ArrayList;
import java.util.List;

public class Ex01RawType {
	public static void main(String[] args) {
		//raw type --> valid at prior Java1.4
		List list = new ArrayList();
		
		//list of numbers
		list.add(1);
		list.add(2);
		list.add("hello");
		list.add(3d);
		list.add(true);
		
		// double list of numbers
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		//throw error at runtime
		//never use raw type
		
	}
}
