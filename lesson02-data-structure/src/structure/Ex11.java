package structure;

public class Ex11 {
	// Kiểm tra kí tự nhập vào có phải là số hay không?
	// Kiểm tra chuỗi nhập vào có phải là số hay không?

	// TH1: Tự code
	// TH2: có sẵn
	public static void main(String[] args) {
		char letter = '5';
		System.out.println(letter + " isDigit ? ---> " + isDigit(letter));
		System.out.println(letter + " isDigit ? ---> " + Character.isDigit(letter));
		System.out.println("\n==========================================================\n");
		String sequence = "12x55";
		if (isNumber(sequence)) {
			System.out.println("La chuoi so");
		} else {
			System.out.println("Khong la chuoi so");
		}
		System.out.println(sequence + " isNumber ---> " + sequence.matches("[0-9]{1,}"));

		// [0-9] thỏa mãn 1 ký tự bất kì là số từ 0 - 9
		// [0-9] <=> \d "\\d"
		// {1, } một hoặc nhiều kí tự
		// {1, } <=> +
		// Kết hợp [0-9]{1,} hoặc \\d+

		// thập phân: vd 182.1212 --> regex="\\d+.\\d+"
	}

	// index 0 1 2 3
	// value 1 2 x 5
	private static boolean isNumber(String input) {
		for (int i = 0; i < input.length(); i++) {
			char tmp = input.charAt(i);
			if (!isDigit(tmp)) {
				return false;
			}
		}
		return true;
	}

	private static boolean isDigit(char tmp) {
//		if (tmp >= '0' && tmp <= '9') {
//			return true;
//		} else {
//			return false;
//		}
//	}
		return (tmp >= '0' && tmp <= '9');
	}
}
