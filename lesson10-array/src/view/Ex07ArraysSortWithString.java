package view;

import java.util.Arrays;
import static java.util.Comparator.*;
import java.util.function.Function;

public class Ex07ArraysSortWithString {
	public static void main(String[] args) {
		String[] sequences = {"a", "c", "b", "x", "z", "k"};
		//Arrays.sort(Object[] objects) --> auto descending
		//require : Object compatible with Comparable
		//require Object implement Comparable
		Arrays.sort(sequences);
		System.out.println("sorted sequences 1:" + Arrays.toString(sequences));
		
		
		Arrays.sort(sequences, (o1,o2) -> o2.compareTo(o1));
		System.out.println("sorted sequences 2:" + Arrays.toString(sequences));
		
		sequences = new String[]{"a", "c", "b", null, "x", null, "z", "k"};
		//o1 -> o1 --> Function.identity()
		Arrays.sort(sequences, nullsFirst(comparing(Function.identity(), reverseOrder())));
		System.out.println("sorted sequences 3:" + Arrays.toString(sequences));
		
	}
}
