package immutable;

import bean.StringCounter;

/**
 * Đếm xem trong chuỗi " aBcD172#@! " sau đây có bao nhiêu kí tự in Hoa, Thường
 * và Số
 */

public class Ex06TextTypeApp {
	public static void main(String[] args) {
		String s = "aBcD172#@!";
		StringCounter stringCounter = count(s);
		System.out.println(stringCounter);
	}

	private static StringCounter count(String s) {
		int numberOfUcLetters = 0;
		int numberOfLcLetters = 0;
		int numberOfDigitLetters = 0;

		char[] letters = s.toCharArray();
//		for(char letter: letters) {
//			if(Character.isUpperCase(letter)) {
//				numberOfCapital++;
//			}
//		}

		for (int i = 0; i < s.length(); i++) {
			char letter = s.charAt(i);

			if (Character.isUpperCase(letter)) {
				numberOfUcLetters++;
				continue;
			}
			if (Character.isLowerCase(letter)) {
				numberOfLcLetters++;
				continue;
			}
			if (Character.isDigit(letter)) {
				numberOfDigitLetters++;
				continue;
			}
		}
		return new StringCounter(numberOfUcLetters, numberOfLcLetters, numberOfDigitLetters);
	}
}