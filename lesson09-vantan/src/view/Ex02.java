package view;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		String[] ss = {"sah23gdahdf2317g12h1hgf34",
						"45adgsahd56afsg887saga155",
						"a45sadha86sgdha341",
						"sadgash1231hs12h1hgj132"};
		String[] maxNumbers = getLargestNumber(ss);
		for (String maxNumber : maxNumbers) {
			System.out.println(maxNumber);
		}
		
	}
	private static String[] getLargestNumber(String[] words) {
		String[] maxNumbers = new String[words.length];
		int count = 0;
		for (String word : words) {
			String[] numbersAsString = word.split("^.*[a-z].*$");
			if(numbersAsString == null) {
				maxNumbers[count++] = 0 + "";
			}else {
				int max = Integer.MIN_VALUE;
				for (String number : numbersAsString) {
					int num = Integer.parseInt(number);
					if(max < num) {
						max = num;						
					}
				}
				maxNumbers[count++] = max + "";
			}
		}
		return maxNumbers;
		
	}
}
