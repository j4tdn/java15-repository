package assignment;

import java.util.ArrayList;

public class Ex02 {
	public static void main(String[] args) {
		String s1 = "01a2b3456cde478";
		// getLargestNumber(s1);
		int largestNumber = 0;
		String[] numbers = s1.split("[a-z]+");
		for (int i = 0; i < numbers.length; i++) {
             System.out.print(numbers[i]+ " ");
            if (Integer.parseInt(numbers[i+1])-Integer.parseInt(numbers[i]) > 0) {
				largestNumber = Integer.parseInt(numbers[i+1]);
			}
		}
		 System.out.println(largestNumber);
		 // bug roi a 
	}

	

	public static void getLargestNumber(String s1) {
		ArrayList<Integer> listNumber = new ArrayList<Integer>();
		int largestNumber = 0;
		int i = 0;
		int reset = 0;
		while (i < s1.length()) {
			if (s1.charAt(i) >= '0' && s1.charAt(i) <= '9') {
				largestNumber++;
			}
			if (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z') {
				listNumber.add(largestNumber);
				largestNumber = reset;

			}

			i++;
		}
		for (Integer number : listNumber) {
			System.out.print(" " + number);
		}
	}
}
