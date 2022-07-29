package immutable;
import bean.*;

public class Ex06TextTypeApp {
	public static void main(String[] args) {
		String s="aBcD172#@!";
		count(s);
	}
	private static ReturnType count(String s) {
		ReturnType r1= new ReturnType();
		int nberOfUcLetters=0;
		int nberOfLcLetters=0;
		int nberOfDigitLetters=0;
		
		char[] letters=s.toCharArray();
		for(char letter: letters) {
			if(Character.isUpperCase(letter)) {
				nberOfLcLetters++;
				continue;
			}
			if(Character.isLowerCase(letter)) {
				nberOfUcLetters++;
			}
			if(Character.isDigit(letter)) {
				nberOfDigitLetters++;
			}
		}
		//set 3 result into StringCount
		
		
		r1.setNumberOfLcLetter(nberOfLcLetters);
		r1.setNumberOfUcLetter(nberOfUcLetters);
		r1.setNumberOfDigits(nberOfDigitLetters);
		System.out.println(r1);
		return r1;
	}
}
