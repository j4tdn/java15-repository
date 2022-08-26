package view;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

import static java.util.Comparator.*;

public class Ex08_ArraysSortWithString {
	public static void main(String[] args) {
		String[] s = {"a", "c", "b", "x", "z", "k"};
		//Arrays.sort(Object[] objects --> auto descending
		//require:Object compatible with Comparable
		Arrays.sort(s);
		System.out.println(Arrays.toString(s));
		
		Arrays.sort(s,(o1,o2) -> o2.compareTo(o1));
		System.out.println(Arrays.toString(s));
		//seq -> seq <==> Function.identity()
		Arrays.sort(s, nullsFirst(comparing(Function.identity(),reverseOrder())));
		System.out.println(Arrays.toString(s));


	}
	
}
