package immutable;

import bean.StringCounter;

public class Ex06TextTypeApp {
	public static void main(String[] args) {
		String s = "aBcasf343D172#@!";
		System.out.println(count(s));
	}
	
	private static StringCounter count(String s) {
		
			int numofUlettter = 0;
			int numofLletter = 0;
			int numberofDletter = 0;
			char[] letters = s.toCharArray();
			for (char letter : letters) {
				if(Character.isUpperCase(letter)) {
					numofUlettter++;
					continue;
				}
				if(Character.isLowerCase(letter)) {
					numofLletter++;
					continue;
					
				}
				if (Character.isDigit(letter)) {
					numberofDletter++;
					
					
				}
			}
			StringCounter stringCounter = new StringCounter(numofUlettter, numofLletter, numberofDletter);
			return stringCounter;	
	}
}
