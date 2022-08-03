package Ex01;

public class InputString {

	public static void main(String[] args) {
		String str = "Vô Địch Thiên Hạ";
		printEachLine(str);
		System.out.println("================");
		printOnNewLine(str);
		System.out.println("================");
		reverseEachChar(str);
		System.out.println("================");
		reverseEachWord(str);
	}

	private static void printEachLine(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				System.out.println(str.charAt(i));
			}
		}
	}

	private static void printOnNewLine(String str) {
		String[] stringArr = str.split("[\\s]+");
		for (String word : stringArr) {
			System.out.println(word);
		}
	}

	private static void reverseEachChar(String str) {
		StringBuilder stb = new StringBuilder();
		stb.append(str);
		System.out.println(stb.reverse());
	}

	private static void reverseEachWord(String str) {
		String[] stringArr = str.split("[\\s]+");
		for (String word : stringArr) {
			System.out.print(new StringBuffer().append(word).reverse() + " ");
		}
	}
}
