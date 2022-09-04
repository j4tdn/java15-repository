package view;

import static java.util.Comparator.comparing;
import static java.util.Comparator.nullsFirst;
import static java.util.Comparator.reverseOrder;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

public class Ex07ArraySortWithString {
	public static void main(String[] args) {
		String[] sequences = { "a", "c", "b", "x", "z", "k" };
		// Arrays.sort(Object[] object ) --> Auto descending
		// require : Object compatible with Comparable
		// require : Object implements Comparable
		Arrays.sort(sequences);
		System.out.println("sorted sequences :" + Arrays.toString(sequences));

		Arrays.sort(sequences, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
		});
		System.out.println("sorted sequences :" + Arrays.toString(sequences));
		sequences = new String[] {"a","b","c", null , "x" , "k" , "z" , null};
		// seq -> seq <--> Function.identity() neu chi co 1 thuoc tinh
		Arrays.sort(sequences, comparing(seq -> seq, reverseOrder()) );
		Arrays.sort(sequences, nullsFirst(comparing(Function.identity(), reverseOrder())));
		System.out.println(Arrays.toString(sequences));
	}

}
