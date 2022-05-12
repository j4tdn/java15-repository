package structure;

public class Ex05 {
	public static void main(String[] args) {
		
		char letter = '1';
		System.out.println("letter: " + letter);
		
		Character character = new Character('B');
		character = null;
		System.out.println("character: " + character);
		System.out.println("checking: " + Character.isAlphabetic(letter));
		
		String input = "253615";
		System.out.println("isNumber: " + input.matches("\\d+"));
	}
}
	


