package view;

import java.util.Arrays;
import static java.util.Comparator.*;
public class Ex07ArraysSortWithString {
	public static void main(String[] args) {
		String[] sequences = {"a", "c", "b", "x", "z", "k"};
		
		Arrays.sort(sequences);
		System.out.println("1st asc sorted sequences: "+Arrays.toString(sequences));

		Arrays.sort(sequences, new Comparator<String>){
			public int compare(String o1, String o2) {
				return o2.compare(o1)
			}
		});
		System.out.println("2nd desc sorted sequences "+Arrays.toString(sequences));
		sequences = new String[]{"a", "c", "b", null, "x", null, "z", "k"};
		
		Arrays.sort(sqeunces, nullsFirst(comparing(function.indentity), reverseOrder))
	}
}
