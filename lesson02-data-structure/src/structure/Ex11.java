package structure;

public class Ex11 {
	public static void main(String[] args) {
		char letter = 'a';
		System.out.println(letter + " is digit ? --> " + isDigit(letter));
		System.out.println(letter + " is digit ? --> " + Character.isDigit(letter));

		System.out.println("\n=====================\n");

		String sequence = "125555555555555"; // 156
		System.out.println(sequence + "is number --> " + isNumber(sequence));
		System.out.println(sequence + "is number --> " + sequence.matches("\\d+"));
		// [0-9] : thoa man 1 ky tu bat ki la so tu 0-9
		// [0-9] <=> \d "\\d"
		// {1,} : 1 hoac nhieu ki tu
		// {1,} : <=> +
		// ket hop : [0-9]{1,} hoac \\d+

		// thap phan : 182.6272 regex ="\\d+."

		// regex stands for regular expression --> bieu thuc chinh quy la tap cac quy
		// tac, cu phap cho chuoi

	}// length ==> lay do dai cua chuoi
		// index(int) 0 1 2 3 --
		// value(char) 1 2 x 5

	private static boolean isNumber(String input) {
		for (int i = 0; i < input.length(); i++) {
			char tmp = input.charAt(i);
			// if (isDigit(tmp) == true) => if (isDigit (tmp))
			// if (isDigit(tmp) == false) => if (!isDigit(tmp))

			if (!isDigit(tmp)) {
				return false;
			}
		}
		return true;
	}

	private static boolean isDigit(char input) {

		return (input >= '0' && input <= '9');

	}

}
