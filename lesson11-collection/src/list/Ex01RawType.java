package list;

import java.util.ArrayList;
import java.util.List;

public class Ex01RawType {
	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add("Hello");
		list.add(3d);
		list.add(true);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
