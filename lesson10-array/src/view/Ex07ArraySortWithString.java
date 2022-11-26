package view;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

import static java.util.Comparator.*;

public class Ex07ArraySortWithString {
	public static void main(String[] args) {
		String[] sequences =  {"a", "c", "b", "x", "z", "k"};
		//Auto deceding
		//
		Arrays.sort(sequences);
		System.out.println("sorted sequences" + Arrays.toString(sequences));
		Arrays.sort(sequences, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		});
		System.out.println("2nd sorted sequences" +Arrays.toString(sequences));
		
		Arrays.sort(sequences, comparing(Function.identity(), reverseOrder()));
		System.out.println("3rd sorted sequences" +Arrays.toString(sequences));
	}
	
}
