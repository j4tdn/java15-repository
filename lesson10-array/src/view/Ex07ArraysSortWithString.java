package view;

import java.util.Arrays;
import static java.util.Comparator.*;
import java.util.function.Function;
import java.util.Comparator;
public class Ex07ArraysSortWithString {
	public static void main(String[] args) {
		String[] sequences = {"a", "b", "c", "x", "z", "k"};
		
		Arrays.sort(sequences); 
		System.out.println("1st sorted= " + Arrays.toString(sequences));
		
		Arrays.sort(sequences, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		System.out.println("2nd sorted= " + Arrays.toString(sequences));
		sequences =new String[] {"a", "c", "b",null, "x", null, "z", "k"};
		//seq -> seq
//		Arrays.sort(sequences, nullsFirst((comparing(Function.identity()))));
		Arrays.sort(sequences, nullsFirst(reverseOrder()));
		System.out.println("3ed sorted= " + Arrays.toString(sequences));
		
	}

	
}
