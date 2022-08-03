package view;

public class Ex01ShowInputString {
	public static void main(String[] args) {
		String texts = "Chào mừng đến với lớp học      java";
		System.out.println("Show one character in one line: ");
		for (char text : showOneCharactersOneLine(texts)) {
			System.out.println(text);
		}
		System.out.println("=============================");
		System.out.println("Show one word in one line: ");
		for (String text : showOneWordOneLine(texts)) {
			System.out.println(text);
		}
		System.out.println("=============================");
		System.out.print("Revert string by words: ");
		System.out.println(revertStringByWords(texts));
		System.out.println("=============================");
		System.out.print("Revert string by characters: ");
		System.out.println(revertStringByChars(texts));
	}

	private static char[] showOneCharactersOneLine(String s) {
		char[] result = new char[s.length()];
		result = s.replaceAll("\\s+", "").toCharArray();
		return result;
	}

	private static String[] showOneWordOneLine(String s) {
		return s.split("\\s+");
	}

	private static StringBuilder revertStringByChars(String s) {
		
		StringBuilder sb = new StringBuilder(s.replaceAll("\\s+", " ")).reverse();
		return sb;
	}

	private static StringBuilder revertStringByWords(String s) {
		String[] text = s.split("\\s+");
		StringBuilder sb = new StringBuilder("");
		for (int i = text.length - 1; i >= 0; i--) {
			sb = sb.append(text[i] + " ");
		}
		return sb;
	}

}
