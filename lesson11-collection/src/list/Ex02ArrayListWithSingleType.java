package list;

import java.util.ArrayList;
import java.util.List;

public class Ex02ArrayListWithSingleType {
    public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		// JAVA1.5 -> auto(boxing,unboxing)
		// int Integer , double Double , ...
		int a = 10;
		Integer b = a ;
		a = b;
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
	//	numbers.add(b);
		// numbers.add("4"); 
		// catch error at compile , better than raw type
		
		System.out.println("size :" + numbers.size());
	}
}
