package immutable;

public class Ex08FormatString {
	public static void main(String[] args) {
		// string --> lower, upper letters, numbers and spaces
		// separator --> split
		String text = "wElcome  ,,- To  --    jaVA15  Class";
		System.out.println(format(text));
		
		// require --> format: first word's letter have to be upper case, others will be lowe case
		// output: Welcome To Java15 Class
	}
	
	private static String format(String text) {
		String formattedText = "";
		// \\s{1,}
		// \\s+
		// [\\s,-]{1,}
		String[] words = text.split("[\\s,-]+");
		for (String word: words) {
			String formattedWord = Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
			formattedText += formattedWord + " ";
		}
		return formattedText;
	}
}
