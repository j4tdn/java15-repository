package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex01 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3,4, 3, 5,3 ,2, 4);
		Set<Integer> result = new HashSet<>();
		result.addAll(numbers);
		
		numbers.retainAll(result);
		System.out.println(result);
	}
	 
}
