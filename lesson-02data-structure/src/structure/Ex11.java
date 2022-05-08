package structure;

public class Ex11 {
	public static void main(String[] args) {
		char letter = 'a';
		System.out.println(letter+ " is digit?---> " +isDigit(letter));
		System.out.println(letter+ " is digit?---> " +Character.isDigit(letter));
	
	
		System.out.println("\n==================\n");
		
		String sequence = "12937489";
		System.out.println(sequence+ " is number? "+isNumber(sequence));
		System.out.println(sequence+ " is number? "+sequence.matches("\\d+"));
	}
	public static boolean isNumber(String input) {
		for (int i = 0; i < input.length(); i++) {
			char tmp = input.charAt(i);
			
			if(!isDigit(tmp)) {
				return false;
			}
		}
		return true;
	}
	private static boolean isDigit(char input) {
		return (input >= '0' && input <='9');
	}
}
