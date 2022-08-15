package view;

import java.util.Arrays;
import java.util.Comparator;

import static java.util.Comparator.*;



public class Ex03SortString {
	public static void main(String[] args) {
	String[] strings = {"-2", "-6", "10", null, "4", "8", null, "Special", "a", "c",
				"b", "xx"};
	Comparator<String> comparator = new Comparator<String>() {
		
		@Override
		public int compare(String s1, String s2) {
		if(s1.equals("Special")) {
			return -1;
		}
		if(s2.equals("Special")) {
			return 1;
		}
		if(s1.matches("[-,0-9]+")&&s2.matches("[-,0-9]+")) {
			return Integer.parseInt(s1)-Integer.parseInt(s2);
		}
		return s1.compareTo(s2);
		}
		
	};
	//ASC
	Arrays.sort(strings,nullsLast( comparator));
	System.out.println(Arrays.toString(strings));
	//DEC
	Arrays.sort(strings, nullsLast(comparator).reversed());
	System.out.println(Arrays.toString(strings));
	
	}
	
	
	}
	

