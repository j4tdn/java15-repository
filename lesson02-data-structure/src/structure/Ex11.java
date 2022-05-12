package structure;

public class Ex11 {
	public static void main(String[] args) {
		char letter = '5';
		System.out.println(letter + " is digit ? --> " +isDigit(letter));
	}

	private static boolean isDigit(char input) {
		return (input >= '0' && input <= '9');
		
		
	}
}

