package ex02;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		String s1 = "01a2b3456cde478";
		int[] largestNumber1 = getLargestNumber(s1);
		System.out.println(Arrays.toString(largestNumber1));
		System.out.println("------------");

		String[] s2 = { "aa6b546c6e22h", "aa6b326c6e22h" };
		int[] largestNumber2 = getLargestNumber(s2);
		System.out.println(Arrays.toString(largestNumber2));
	}

	private static int[] getLargestNumber(String...ss) {
		int[] result = new int[100];
		int index = 0;
		for (String string : ss) {
			String[] numberStrings = string.split("[a-zA-Z]+");
			int[] numbers = new int[numberStrings.length];
			int count = 0;
			for (String i : numberStrings) {
				if (i.compareTo("") != 0) {
					numbers[count++] = Integer.parseInt(i);
				}
			}
			Arrays.sort(numbers);
			result[index++] = numbers[numbers.length - 1];
		}
		return Arrays.copyOfRange(result, 0, index);
	}
}