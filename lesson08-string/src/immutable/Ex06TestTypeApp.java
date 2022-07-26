package immutable;

public class Ex06TestTypeApp {
	public static void main(String[] args) {
		String s = "sBcd172#@";
		StringCounter counter  = count(s);
		System.out.println("numberOfUcLetters: " + counter.numberOfUcLetters);
		System.out.println("numberOfLcletters: " + counter.numberOfLcletters);
		System.out.println("numberDigitLetters: " + counter.numberDigitLetters);
		
	}
 private static StringCounter count(String s) {
	 int nberOfUcLetters = 0;
	 int nberOfLcLetters = 0;
	 int nberOfDigitLetters= 0;
	 char[] letters = s.toCharArray();
	 for(char letter: letters) {
		 if(Character.isUpperCase(letter)) {
			 nberOfUcLetters++;
		 }
		 if(Character.isLowerCase(letter)) {
			 nberOfLcLetters++;
		 }
		 if(Character.isDigit(letter)) {
			 nberOfDigitLetters++;
		 }
	 }
	 StringCounter counter = new StringCounter();
	 counter.numberOfUcLetters = nberOfUcLetters;
	 counter.numberOfLcletters =nberOfLcLetters;
	 counter.numberDigitLetters = nberOfDigitLetters;
	 
	 return counter;
 }
}
