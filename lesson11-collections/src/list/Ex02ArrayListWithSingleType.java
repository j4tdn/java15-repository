package list;

import java.util.ArrayList;
import java.util.List;

public class Ex02ArrayListWithSingleType {
	public static void main(String[] args) {
		// > JAVA 1.5 --> auto boxing, unboxing
		// int = Integer, double = Double,...
		
		// this.elementDate  = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
		// new ArrayList<>() --> first add --> elementData with length = default capacity
		// new ArrayList<>(20) --> first add --> elementData with length = default capacity
		
		List<Integer> numbers = new ArrayList<>();
		int x = 5;
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(x);
		// numbers.add("5"); 
		// catch error at compile, better than raw type
	}
}
