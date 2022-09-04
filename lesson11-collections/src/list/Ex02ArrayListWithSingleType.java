package list;

import java.util.ArrayList;
import java.util.List;

public class Ex02ArrayListWithSingleType {

	public static void main(String[] args) {
		// java 1.5 auto boxing( nguyên thuỷ sang đối tượng), unboxing
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(x);
		//number.add("4");
		//catch error at compile, better than raw type                       
		
		System.out.println("size: " + numbers.size());
	}

}
