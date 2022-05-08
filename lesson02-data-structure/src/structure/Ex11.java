package structure;

public class Ex11 {
	public static void main(String[] args) {
		char letter = '5';
		System.out.println(letter + "is digit ? --> " + isDigit(letter));
		System.out.println(letter + "is digit ? --> " + Character.isDigit(letter));
		System.out.println("\n==========================\n");
		String sequence = "12x5"; //156
		isNumber(sequence);

		
	}
	private static boolean isNumber(String input) {
		for(int i = 0; i < input.length(); i++) {
			char tmp = input.charAt(i);
			if (!isDigit(tmp)) {
				return false;
			}
		}
		return true;
	}
	private static boolean isDigit(char input) {
		if  (input >= '0' && input <= '9') 
			return true;
			
		return false;
		}
	}

