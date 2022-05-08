package structure;

public class Ex05 {
	public static void main(String[] args) {
		int number = 10;
		char letter = 'A';
		System.out.println("letter: " + letter);
		
		Character character = new Character('B');
		System.out.println("character: " + character);
		System.out.println("checking: " + Character.isAlphabetic(letter));
		
		String input = "25a3615";
		System.out.println("isNumber: " + input.matches("\\d+"));
		
	}

}
