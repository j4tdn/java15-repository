package immutable;

public class Ex08FormatString {
	public static void main(String[] args) {
		// string --> lower, upper letters, numbers and spaces
		// separator --> split
		String text = "wELcome---,   To ,,  jaVA15  ,--  Class";
		// require --> format: first word's letter have
		System.out.println(formatString(text));
	}

	private static String formatString(String text) {
		String formattedText = "";
		// \\s{1,}
		// \\s+
		String[] words = text.split("[\\s,-]+");
		for (String word: words) {
			String formattedWord = Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
			formattedText += formattedWord + " ";
		}
		return formattedText;
	}
}
