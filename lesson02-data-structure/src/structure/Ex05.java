package structure;

public class Ex05 {
     public static void main(String[] args)  {
         char letter = 'A';
    	 System.out.println("letter: " + letter);
    	 
    	 Character chatacter = new Character('B');
    	 System.out.println("chatacter: " + chatacter);
    	 System.out.println("checking: " + Character.isAlphabetic(letter));
    	 
    	 String input = "123";
    	 System.out.println("isNumber: " + input.matches("\\d+"));
	}
}
