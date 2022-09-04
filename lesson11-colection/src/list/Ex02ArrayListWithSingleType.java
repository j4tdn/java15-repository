package list;

import java.util.ArrayList;
import java.util.List;

public class Ex02ArrayListWithSingleType {
	public static void main(String[] args) {
		// > JAVA 1.5 --> auto(boxing, unboxing)
		// int Integer, double Double ...
		
		//  this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
		// new ArrayList<>() --> first add --> elemenData with length = default capacity
		// new ArrayList<>(20) --> first add --> elemenData with length = input capacity
		// size: real elements in elementData
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		// numbers.add("4"); 
		// catch error at compile, better than raw type
		
		System.out.println("size: " + numbers.size());
	}
}