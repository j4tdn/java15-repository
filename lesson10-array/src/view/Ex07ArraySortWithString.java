package view;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

import static java.util.Comparator.*;

public class Ex07ArraySortWithString {
	public static void main(String[] args) {
		String[] sequence = { "a", "c", "b", "y", "z" };

		// Array.sort(Object[] objects) --> auto descending
		// require: Object, compatible with Comparable
		// require: Object implement Comparable
		Arrays.sort(sequence);
		System.out.println("1st asc sequence: " + Arrays.toString(sequence));

		Arrays.sort(sequence, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		System.out.println("2nd desc sorted sequences: " + Arrays.toString(sequence));

		sequence = new String[] { "a", "c", null, "b", "y", null, "z" };
	//	Arrays.sort(sequence, nullsFirst(comparing(Function.identity(), reverseOrder())));
		Arrays.sort(sequence, nullsFirst(reverseOrder()));
		System.out.println("3rd asc sorted sequences" + Arrays.toString(sequence));
	}

}
