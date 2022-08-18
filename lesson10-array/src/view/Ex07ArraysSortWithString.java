package view;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

public class Ex07ArraysSortWithString {
	public static void main(String[] args) {
		String[] sequences = {"a","c","b","x","z","k"};
//		Arrays.sort(sequences, (o1,o2) -> o2.compareTo(o1));
		
		
		sequences = new String[]{"a","c",null,"b","x","z","k"};
		Arrays.sort(sequences, Comparator.nullsFirst(
				Comparator.comparing(Function.identity(),Comparator.reverseOrder()))
				);
		Arrays.sort(sequences, Comparator.nullsFirst(
				Comparator.reverseOrder())
				);
		// reversed() dat cuoi 
		// reverseOrder dat trong cac comparing
		System.out.println(Arrays.toString(sequences));
		
	}
}
