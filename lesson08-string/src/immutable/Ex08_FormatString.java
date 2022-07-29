package immutable;

public class Ex08_FormatString {
	public static void main(String[] args) {
		String text = "wElcome ,-To jAVA15 Class";
		System.out.println(format(text));
	}
	private static String format(String text) {
		String formattedText ="";
		String[] word = text.split("[\\s,-]+");
		for(String words : word) {
			String formattedWord = Character.toUpperCase(words.charAt(0)) + words.substring(1).toLowerCase();
			formattedText += formattedWord + " ";
		}
		return formattedText;
	}
}
