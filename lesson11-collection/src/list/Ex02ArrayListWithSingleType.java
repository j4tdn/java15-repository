package list;

import java.util.ArrayList;
import java.util.List;

public class Ex02ArrayListWithSingleType {
	public static void main(String[] args) {
		// >Java 1.5 -> auto(boxing,unboxing)
		//int Integer double Double
		List<Integer> numbers= new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		//numbers.add("4");    -> catch error at compile
		System.out.println("size: "+ numbers.size());
	}
}
