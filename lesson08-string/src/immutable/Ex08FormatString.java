package immutable;

public class Ex08FormatString {
	public static void main(String[] args) {
		String text = "wElcome  ,,--  To  --,  jaVa15   Class";
		
	
		//require --->format: first word's have to be upper case, other will be lowe case
		//output : Welcome
		System.out.println(format(text));
		
		
	}
	private static String format(String text) {
		String formattedText = "";
		String[] words = text.split("[\\s,-]+");
		for(String word : words) {
			String formattedWord = Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
			formattedText += formattedWord + " ";
		}
		return formattedText;
	}
}
