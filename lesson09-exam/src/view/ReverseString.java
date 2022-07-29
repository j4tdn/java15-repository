package view;

public class ReverseString {
	public static void main(String[] args) {

		String text = "Welcome  to JAVA10   class";
   System.out.println(reverse(text));
	}

	private static String reverse(String text) {
		String formattedText = " ";
		text = text.replaceAll("\\s+", " ");
	String [] words=  text.split("//s");
	Character.toUpperCase(text.charAt(0));
	for(String word: words) {
		String formattedword = Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
		formattedText += formattedword+ " ";
	}
	for(int i = 0; i<formattedText.length()-1)/2;i++){
		
	}
	return formattedText;

	}
}