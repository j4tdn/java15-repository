package list;

import java.util.ArrayList;
import java.util.List;

public class Ex02ArraylistWithSingleType {
	public static void main(String[] args) {
		
		// > JAVA 1.5 -> auto(boxing,unboxing)
		List<Integer> numbers = new ArrayList<>();
		
		int x = 5;
		numbers.add(1);
		numbers.add(1);
		numbers.add(1);
		numbers.add(x); //Allow from JAVA 1.5
		//numbers.add("4");
		// catch error at compile, better than raw type
		
		System.out.println("size: " + numbers.size());
	}
}
