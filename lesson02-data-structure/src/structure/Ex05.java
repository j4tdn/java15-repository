package structure;

public class Ex05 {
public static void main(String[] args) {
	Integer digit = new Integer(123); 
	char letter = 'A';
	
	System.out.println("letter: " + letter);
	Character character = new Character('B');
System.out.println("character: " +character);
System.out.println("checking: " + Character.isAlphabetic(letter) );
}
}
