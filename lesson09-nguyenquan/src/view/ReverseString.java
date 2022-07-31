package view;

public class ReverseString {
	public static void main(String[] args) {

		String text = "Welcome  to JAVA10   class";
		System.out.println(reverse(text));
	}

	private static String reverse(String text) {
		String formattedText = " ";
		text = text.replaceAll("\\s+", " ");
		Character.toUpperCase(text.charAt(0));
		String[] words = text.split("\\s");

		for (String word : words) {

			StringBuilder sb = new StringBuilder(word);
			sb.reverse();
			formattedText += sb + " ";

		}

		return formattedText;

	}
}