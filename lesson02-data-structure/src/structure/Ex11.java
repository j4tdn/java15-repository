package structure;

public class Ex11 {
	public static void main(String[] args) {
		char letter = 'x';
		System.out.println(letter + " is Digit ? -->" + isDigit(letter));
		System.out.println(letter + " is Digit ? -->" + Character.isDigit(letter));
		
		System.out.println("\n=============================\n");
		
		String sequence = "12x5";
		System.out.println(sequence + " is Number ? -->" + isNumber(sequence));
		System.out.println(sequence + " is Number ? -->" + sequence.matches("[0-9]{1,}"));
		isNumber(sequence);
	}
	private static boolean isDigit(char input) {
		return (input >= '0' && input <= '9');
	
	}
	private static boolean isNumber(String input) {
		for(int i =0; i < input.length(); i++) {
			char tmp = input.charAt(i);
			if(!isDigit(tmp)) {
				return false;
			}
		}
		return true;
		
	}
	
}
