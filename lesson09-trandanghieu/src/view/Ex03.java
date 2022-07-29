package view;

public class Ex03 {
	public static void main(String[] args) {
		String input = "Welcome    to   JAVA10   class";

		System.out.println(format(input));
	}

	private static String format(String text) {
		String formattedText = "";
		StringBuilder str = new StringBuilder(text).reverse();

		String[] words = str.toString().split("[\\s,-]{1,}");

		for (String word : words) {
			formattedText += word + " ";
		}

		return formattedText;
	}
}
