package logic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

import static java.util.Comparator.*;

public class SortString01 {
	public static void main(String[] args) {
		String[] strings = {"-2", "-6", "10", "4", null, "ad", "8", "a", "c",
				"b", "xx"};
		Arrays.sort(strings, Comparator.nullsFirst(comparing(Function.identity())));
		
		System.out.println(Arrays.toString(strings));
			
	}
	
}
