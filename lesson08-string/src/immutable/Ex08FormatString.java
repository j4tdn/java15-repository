package immutable;

public class Ex08FormatString {
	//string --> lower, upper letters, number and spaces
	//separator --> split
	public static void main(String[] args) {
		String text = "wElcome    ,,-To ---jaVA15-Class";
		System.out.println(format(text));
		
		// require --> format: first word's letter have to be upper case, others will be lowe case
		// output: welcome To Java15 class
	}
	private static String format(String text) {
		String formattedText = "";
		// \\s{1,}
		// \\s+
		String [] words = text.split("[\\s,-]{1,}");
	//	String [] words = text.split("\\s+");
		for(String word: words) {
		String formattedWord =	Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
			formattedText += formattedWord + " ";
		}
		return formattedText;
	}
}
