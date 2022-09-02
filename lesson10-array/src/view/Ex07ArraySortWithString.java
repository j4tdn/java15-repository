package view;

import static java.util.Comparator.comparing;
import static java.util.Comparator.nullsFirst;
import static java.util.Comparator.reverseOrder;

import java.util.Arrays;
import java.util.function.Function;

public class Ex07ArraySortWithString {
	public static void main(String[] args) {
		String[] sequences = { "a", "b", "c", "y", "x", "z" };

		// Arrays.sort(Object[] objects) -> auto ascending
		// require: Object compatible with Comparable
		// require: Object 
		Arrays.sort(sequences);
		System.out.println("1st asc sorted string: " + Arrays.toString(sequences));

		
		Arrays.sort(sequences, (s1, s2) -> s2.compareTo(s1));
		System.out.println("2st des sorted string: " + Arrays.toString(sequences));

		sequences = new String[]{ "a", "b", "c",null, null, "y", null, "x", "z" };
		
		// seq -> seq --> Function.identity()
		// nullsFirst(reverseOrder())) because sort string array
		Arrays.sort(sequences, nullsFirst(comparing(Function.identity(), reverseOrder())));
		System.out.println("3rd asc sorted string: " + Arrays.toString(sequences));
	}
}
