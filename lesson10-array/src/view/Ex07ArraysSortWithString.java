package view;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

import static java.util.Comparator.*;

public class Ex07ArraysSortWithString {
	public static void main(String[] args) {
		String[] sequences = {"a", "c", "b", "x", "z", "k"};
		//Arrays.sort(object[] object) --> auto descending : tang dan
		//require: object compatible with combarable
		//
		Arrays.sort(sequences);
		System.out.println(Arrays.toString(sequences));
		
		Arrays.sort(sequences, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		
		System.out.println(Arrays.toString(sequences));
		
		sequences = new String[]{"a", "c", null, "b", null, "x", "z", "k"};
		
		Arrays.sort(sequences,nullsFirst( comparing(Function.identity(), reverseOrder())));
		
		System.out.println(Arrays.toString(sequences));
	}
}
