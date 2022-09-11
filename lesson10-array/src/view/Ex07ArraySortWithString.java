package view;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import static java.util.Comparator.*;

public class Ex07ArraySortWithString {
	public static void main(String[] args) {
		String[] sequences = { "a", "c", "d", "x", "z", "k" };
		// Array.sort(Object[] objects)-> auto descending
		//require: Object compatible with Comparable
		//require: Object impliment Comparable
		Arrays.sort(sequences);
		System.out.println(" 1st:Sorted Array: " + Arrays.toString(sequences));

		Arrays.sort(sequences, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {

				return o2.compareTo(o1);
			}
		});
		System.out.println("2nd sorted array" + Arrays.toString(sequences));
		

	 sequences =  new  String[]{ "a", "c", null,"d", "x", "z",null, "k" };
		
		// seq-> seq ---> Fun
		Arrays.sort(sequences, nullsFirst(comparing(Function.identity(), reverseOrder() ) ));
		System.out.println("3rd sorted array: "+ Arrays.toString(sequences));
	}
}
