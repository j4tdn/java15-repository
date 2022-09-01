package list;

import java.util.ArrayList;
import java.util.List;

public class Ex02ArrayListWithSingleType {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		
		int x = 5;
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(x);
		//catch error at compile, better than raw type
		System.out.println("size: " + numbers.size());
		
	}
	
}
