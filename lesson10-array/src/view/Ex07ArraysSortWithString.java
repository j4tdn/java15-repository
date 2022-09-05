package view;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

import static java.util.Comparator.*;

public class Ex07ArraysSortWithString {
	public static void main(String[] args) {
		String[] sequences = {"a", "c", "b", "x", "h", "e"}; 
		
		Arrays.sort(sequences);
		System.out.println("1st asc sorted sequences: " + Arrays.toString(sequences));
		
		Arrays.sort(sequences, new Comparator<String>() {
		@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		System.out.println("2nd desc sorted sequences: " + Arrays.toString(sequences));
		
		Arrays.sort(sequences, comparing(Function.identity(), reverseOrder()));
		System.out.println("3rd asc sorted sequences: " + Arrays.toString(sequences));
	}
}
