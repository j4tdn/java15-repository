package immutable.exercises;

public class Ex06 {
	public static void main(String[] args) {
		String s = "aBcD172#@!";
		StringCounter stringCounter = count(s);
		System.out.println(stringCounter);
		
	}

	private static StringCounter count(String s) {
		int nberOfUcLetters = 0;
		int nberOfLcLetters = 0;
		int nberOfDigitLetters = 0;
        
        
        for(int i = 0; i < s.length(); i++) {
        	char letter = s.charAt(i);
        	if(Character.isUpperCase(letter)) {
        		nberOfUcLetters++;
        		continue;
        	}
        	if(Character.isLowerCase(letter)) {
        		nberOfLcLetters++;
        		continue;
        	}
        	if(Character.isDigit(letter)) {
        		nberOfDigitLetters++;
        	}
        }
        return new StringCounter(nberOfUcLetters, nberOfLcLetters, nberOfDigitLetters);
	}
}
