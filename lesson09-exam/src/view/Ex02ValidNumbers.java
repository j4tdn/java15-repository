package view;

public class Ex02ValidNumbers {
	public static void main(String[] args) {
		String s1 = "xyz01a2b3456cde478";
		// getLargestNumber(s1);

		String[] numbers = s1.split("[a-z]+");
		for (String number : numbers) {
			if (number.matches("\\d+")) {
				System.out.println(number);
			}
		}
		System.out.println("===========================================");
		String[] numberAsStrings = new String[s1.length() / 2];
		int running = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s1.length(); i++) {
			char letter = s1.charAt(i);
			if (Character.isDigit(letter)) {
				sb.append(letter);
				if (i == s1.length() - 1) {
					numberAsStrings[running++] = sb.toString();
				}
			} else {
				numberAsStrings[running++] = sb.toString();
				sb.delete(0, sb.length());
			}
		}
	}
}
