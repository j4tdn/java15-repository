package view;

import java.util.Arrays;

public class Ex02ValidNumbers {
	public static void main(String[] args) {
		String[] elements = { "aa01a2b3456cde478a", "aa6b326c6e22"};
		for (String element: elements) {
			String[] numbersAsString = getValidNumbersAsString(element);
			int max = max(numbersAsString);
			System.out.println(Arrays.toString(numbersAsString) + " ==> " + max);
		}
	}
	
	// -256 -6 -333 -148
	private static int max(String[] numbersAsString) {
		int max = Integer.MIN_VALUE;
		for (String numberAsString: numbersAsString) {
			int number = Integer.parseInt(numberAsString);
			if (max < number) {
				max = number;
			}
		}
		return max;
	}

	private static String[] getValidNumbersAsString(String s) {
		String[] numbersAsString = new String[s.length() / 2];
		int running = 0;
		StringBuilder sb = new StringBuilder();
		sb.append(Character.isDigit(s.charAt(0)) ? s.charAt(0) : "");
		for (int i = 1; i < s.length(); i++) {
			char letter = s.charAt(i);
			if (Character.isDigit(letter)) {
				sb.append(letter);
				if (i == s.length() - 1) {
					numbersAsString[running++] = sb.toString();
				}
			} else {
				if (Character.isDigit(s.charAt(i - 1))) {
					numbersAsString[running++] = sb.toString();
					sb.delete(0, sb.length());
				}
			}
		}
		return Arrays.copyOfRange(numbersAsString, 0, running);
	}
}