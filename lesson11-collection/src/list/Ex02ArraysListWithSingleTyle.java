package list;

import java.util.ArrayList;
import java.util.List;

public class Ex02ArraysListWithSingleTyle {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>(20);
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		//numbers.add("4"); // catch erro at compile, better than raw type
		
		System.out.println("size " + numbers.size());
	}
}
