package structure;

public class Ex11 {
	// 1. Kiem tra ki tu nhap vao co phai so hay khong
	// 2. Kiem tra chuoi nhap vao co phai so hay khong
	// Case 1: Tu code ra
	// Case 2: Dung ham co san
	public static void main(String[] args) {
		char letter = 'a';
		System.out.println(letter + " is digit? --> " + isDitgit(letter));
		System.out.println(letter + " is digit? --> " + Character.isDigit(letter));
		System.out.println("\n====================================\n");
		String sequence = "12454.65"; // 156
		System.out.println(sequence + " is number? --> " + sequence.matches("-?+?\\d+.\\d+"));
	}

	private static boolean isDitgit(char input) {
		return input >= '0' && input <= '9';
	}

	private static boolean isNumber(String input) {
		for (int i = 0; i < input.length(); i = i + 1) {
			char tmp = input.charAt(i);
			if (!isDitgit(tmp))
				return false;
		}
		return true;

	}
}
