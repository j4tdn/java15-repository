package view;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

import static java.util.Comparator.*;

public class Ex07ArraysSortWithString {
	public static void main(String[] args) {
		String[] sequences = {"a", "c", "b", "x", "z", "k"};
		
		//use Arrays.sort(Object[] objects) --> auto descending
		Arrays.sort(sequences);
		System.out.println("sorted sequences: " + Arrays.toString(sequences));
		
		Arrays.sort(sequences, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			};
		});
		System.out.println("2nd desc sorted sequences: " + Arrays.toString(sequences));
		
		Arrays.sort(sequences, comparing(seq -> seq));
		System.out.println("3nd asc sorted sequences: " + Arrays.toString(sequences));
		
		//seq -> seq == Function.identity()
		Arrays.sort(sequences, comparing(Function.identity()));
		System.out.println("3nd asc sorted sequences: " + Arrays.toString(sequences));
		
		Arrays.sort(sequences, comparing(Function.identity(), reverseOrder()));
		System.out.println("3nd asc sorted sequences: " + Arrays.toString(sequences));
		
		sequences = new String[] {"a", "c", "b", null, "x", null, "z", "k"};
		Arrays.sort(sequences, nullsFirst(comparing(Function.identity(), reverseOrder())));
		System.out.println("3nd asc sorted sequences: " + Arrays.toString(sequences));
	}
}
