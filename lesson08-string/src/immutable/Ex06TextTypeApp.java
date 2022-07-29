package immutable;

public class Ex06TextTypeApp {
	public static void main(String[] args) {
		String s = "aBcD172#@!";
		System.out.println(count(s));
		Finding(s);
		StringCounter stringCounter = count(s);
		System.out.println(stringCounter);
	}

	private static StringCounter count(String s) {
		int numberOfUcLetters = 0;
		int numberOfLcLetters = 0;
		int numberOfDigitLetters = 0;
		char[] letters = s.toCharArray();
		for (char letter : letters) {
			if (Character.isUpperCase(letter)) {
				numberOfUcLetters++;
			}
			if (Character.isLowerCase(letter)) {
				numberOfLcLetters++;
			}
			if (Character.isDigit(letter)) {
				numberOfDigitLetters++;
			}
		}
		return new StringCounter(numberOfUcLetters, numberOfLcLetters, numberOfDigitLetters);
	}

	private static void Finding(String s) {
		int countUpper = 0;
		int countLower = 0;
		int countNumber = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				countLower++;
			} else if (ch >= 'A' && ch <= 'Z') {
				countUpper++;
			} else if (ch >= '0' && ch <= '9') {
				countNumber++;
			}
		}
		System.out.println(" String " + s + " has " + countLower + " lowercase ," + countUpper + " uppercase ,"
				+ countNumber + " numeric ");
	}
}
