package immutable;

import been.StringCounter;

/**
 * Đếm xem trong chuỗi " aBcD172#@! " sau đây có bao nhiêu kí tự in Hoa, Thường và Số.
 */
public class Ex06TextTypeApp {
	public static void main(String[] args) {
		String s = "aBcD172#@!";
		StringCounter stringCounter = count(s);
		System.out.println(stringCounter);
	}
	private static StringCounter count(String s) {
		int nberOfUcLetter = 0;
		int nberOfLcLetter = 0;
		int nberOfDigitLetter = 0;
		
		for(int i= 0; i< s.length();i++ ) {
			char letter = s.charAt(i);
			if(Character.isUpperCase(letter)) {
				nberOfUcLetter++;
				continue;
			}
			if(Character.isLowerCase(letter)) {
				nberOfLcLetter++;
				continue;
			}
			if(Character.isDigit(letter)) {
				nberOfDigitLetter++;
			}
		}
		return new  StringCounter(nberOfUcLetter, nberOfLcLetter, nberOfDigitLetter);
	}
	
	//set 3 result into StringCounter
}
