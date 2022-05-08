package structure;

import bean.Item;

public class Ex05 {
	public static void main(String[] args) {
		char letter = 'A';
		System.out.println("letter: " + letter);
		
		@SuppressWarnings("removal")
		Character character = new Character('B');
		System.out.println("Character: " + character);
		System.out.println("Checking: " + Character.isAlphabetic(letter));
		
		String input = "893h123";
		System.out.println("isNumber:" + input.matches("\\d+"));
		
		Item itemC = new Item(567, "ahlo", 1010);
		System.out.println("Item -C:" + itemC);
	}
}
