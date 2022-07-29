package immutable;

import bean.StringCounter;

public class Ex06TextTypeApp {

	public static void main(String[] args) {

		String s = "aBcDBN1722323#@!";
		StringCounter counter = count(s);
		System.out.println("numberOfUcLetters: " + counter.numberOfUcLetters);
		System.out.println("numberOfLcletters: " + counter.numberOfLcLetters);
		System.out.println("numberDigitLetters: " + counter.numberOfDigitLetters);

	}

	private static StringCounter count(String s) {

		int nberOfUcLetters = 0;
		int nberOfLcLetters = 0;
		int nberOfDigitLetters = 0;
//		char[] letters = s.toCharArray();
//		for ( char letter : letters) {
		for (int i = 0; i < s.length(); i++) {
			char letter = s.charAt(i);
			if (Character.isUpperCase(letter)) {
				nberOfUcLetters++;
				continue;
			}
			if (Character.isLowerCase(letter)) {
				nberOfLcLetters++;
				continue;
			}
			if (Character.isDigit(letter)) {
				nberOfDigitLetters++;
			}
		}
		return new StringCounter(nberOfUcLetters, nberOfLcLetters, nberOfDigitLetters);

		
	}
}

//	private static int count(String s) {
//		 int upper = 0, lower = 0, number = 0, special = 0;
//		 
//	        for(int i = 0; i < s.length(); i++)
//	        {
//	            char ch = s.charAt(i);
//	            if (ch >= 'A' && ch <= 'Z')
//	                upper++;
//	            else if (ch >= 'a' && ch <= 'z')
//	                lower++;
//	            else if (ch >= '0' && ch <= '9')
//	                number++;
//	            else
//	                special++;
//	        }
//	}
