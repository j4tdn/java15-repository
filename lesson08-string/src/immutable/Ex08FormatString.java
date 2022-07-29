package immutable;

public class Ex08FormatString {
	public static void main(String[] args) {
		
	
	String text = "wElcome To jaVA15 Class";
	System.out.println(fommat(text));
	}


private static String fommat(String text) {
	String formattedText = " ";
	String[] words = text.split("[\\s,-]{1,}");
	Character.toUpperCase(text.charAt(0));
	for(String word: words) {
		String formattedword = Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
		formattedText += formattedword+ " ";
	}
	return formattedText;
}	
}

