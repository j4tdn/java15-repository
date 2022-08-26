package list;

import java.util.ArrayList;
import java.util.List;

public class Ex01_RawType {
	public static void main(String[] args) {
		//raw type --> valid at prior JAVA 1.4
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add("hello");
		list.add(3d);
		list.add(true);
		 for(int i = 0; i < list.size();i++) {
			 //looks good at compile
			 System.out.println((int)list.get(i) * 2);
		 }
		//throw error at runtime
		//never use raw type 
	}
}
