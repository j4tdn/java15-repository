package logic;

import java.util.Arrays;
import java.util.Iterator;

public class Ex05HandleString {
	public static void main(String[] args) {
		String[] word = {"sa0sdsh0988sdhf213d4sacj0dsjjd3239sw132sgsa",
						"sag7521hSA8aBhjsh103982ashj",
						"awg2312qgs098a211uxa20sasxh76a7sahak",
						"agxjhsa8123dghsgas8w76G45affg76fgh",
						"asdkjha765safxa987ashasvd98HGg98gJH897Ggjh9879"};
		
		System.out.println(Arrays.toString(getArrayMaxNumbers(word)));
	}
	private static int getMaxNumber(String word) {
		String[] numbersAsString = word.split("\\.*[a-zA-Z]+");
		int[] numbers = new int[numbersAsString.length-1];
		for (int i = 1; i < numbersAsString.length; i++) {
			numbers[i-1] = Integer.parseInt(numbersAsString[i]);
		}
		int maxNumber = Integer.MIN_VALUE;
		for (int number : numbers) {
			if(number > maxNumber) {
				maxNumber = number;
			}
		}
		return maxNumber;
	}
	private static int[] getArrayMaxNumbers(String[] words) {
		int[] maxNumbers = new int[words.length];
		for (int i = 0; i < words.length; i++) {
			maxNumbers[i] = getMaxNumber(words[i]);
		}
		return maxNumbers;
	}
}
