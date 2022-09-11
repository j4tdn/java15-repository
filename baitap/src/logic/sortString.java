package logic;

import java.util.Arrays;
import java.util.Comparator;

public class sortString {
	public static void main(String[] args) {
		String[] sequences = {null, "-2", "3", null,"Special",  "10",null,"Special", "-7", "c", "x", "X", "a"};
		
		Arrays.sort(sequences, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				
				if(o1 == null && o2 != null) {
					return -3;
				}
				if(o2 == null) {
					return 3;
				}
				if(o1 == "Special") {
					return -1;
				}
				if(o1.matches("-\\d+") && o2.matches("-\\d+")) {
					return Integer.parseInt(o1) - Integer.parseInt(o2);
				}
				if(o1.matches("\\d+") && o2.matches("\\d+")) {
					return Integer.parseInt(o1) - Integer.parseInt(o2);
				}
				
				
				
				return o1.compareToIgnoreCase(o2);
			}
		});
		System.out.println(Arrays.toString(sequences));
	}
}
