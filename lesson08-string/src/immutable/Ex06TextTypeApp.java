package immutable;

import bean.StringCounter;

public class Ex06TextTypeApp {
	public static void main(String[] args) {
		String s = "aBcD172#@!";
		
	}
	private static StringCounter count(String s) {
		int numberOfUppercaseLetters = 0;
		int numberOfLowercaseLetters = 0;
		int numberOfDigitLetters = 0;
		
		
		for(int i = 0; i < s.length(); i++) {
			char letter = s.charAt(i);
			if(Character.isUpperCase(letter)) {
				numberOfUppercaseLetters++;
				continue;
			}
			if(Character.isLowerCase(letter)) {
				numberOfLowercaseLetters++;
				continue;
			}
			if(Character.isDigit(letter)) {
				numberOfDigitLetters++;
			}
		}
		//set 3 result into StringCounter
		return new StringCounter(numberOfUppercaseLetters, numberOfLowercaseLetters, numberOfDigitLetters);
	}
}