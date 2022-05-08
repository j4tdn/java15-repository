package structure;

public class Ex11 {
public static void main(String[] args) {
	char letter = 't';
	System.out.println(letter + "is digit ? -->" + isDigit(letter));
	System.out.println(letter + "is digit ? -->" + Character.isDigit(letter));
	System.out.println("\n===============================\n");
	String sequence = "1285";
	System.out.println(sequence + " is number --> " + isNumber(sequence) );
	System.out.println(sequence + " is number --> " + sequence.matches("\\d{1,}"));
	
	
			}
private static boolean isNumber(String input) {
	for(int i = 0; i < input.length(); i++) {
		char tmp = input.charAt(i);		
	if (isDigit(tmp) == false) {
		return false;
	}
		
	}
	return true;
}
private static boolean isDigit(char input) {
	return (input >= '0' && input <= '9');
}
}
