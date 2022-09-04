package view;

import static java.util.Comparator.nullsFirst;
import static java.util.Comparator.reverseOrder;

import java.util.Arrays;
import java.util.Comparator;

public class Ex07ArraysSortWithString {
	public static void main(String[] args) {
		String[] sequences = {"a", "c", "b", "x", "z", "k"};
		
		// Arrays.sort(Object[] objects) --> auto descending
		// require: Object compatible with Comparable
		// require: Object implement Comparable
		Arrays.sort(sequences);
		System.out.println("1st asc sorted sequences: " + Arrays.toString(sequences));
		
		Arrays.sort(sequences, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		System.out.println("2nd desc sorted sequences: " + Arrays.toString(sequences));
		
		sequences = new String[]{"a", "c", "b", null, "x", null, "z", "k"};
		
		// seq -> seq --> Function.identity()
		Arrays.sort(sequences, nullsFirst(reverseOrder()));
		System.out.println("3rd desc sorted sequences: " + Arrays.toString(sequences));
	}
}