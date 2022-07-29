package immutable;

import bean.StringCounter;

public class Ex06TestTypeApp {
	public static void main(String[] args) {
		String s = "aBcD172#@!";
		StringCounter stringCounter = count(s);
		
		System.out.println(stringCounter);
	}

	private static StringCounter count(String s) {
		int nberOfUcLetters = 0;
		int nberOfLcLetters = 0;
		int nberOfDigitLetters = 0;
		
		for (int i = 0 ; i< s.length(); i++) {
		
		char letters = s.charAt(i);
				if (Character.isUpperCase(letters)) {
							nberOfUcLetters++;
						continue;
					}
				if (Character.isLowerCase(letters)) {
					nberOfLcLetters++;
				}
			if(Character.isDigit(letters)) {
				nberOfDigitLetters++;
			}
		}
				return new StringCounter(nberOfDigitLetters, nberOfLcLetters, nberOfUcLetters);
		
		
	}

}
