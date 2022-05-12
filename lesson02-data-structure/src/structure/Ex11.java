package structure;

public class Ex11 {
	// 1. Kiểm tra kí tự nhập vào có phải là số hay không
	// 2. Kiểm tra kí tự nhập vào có phải là chuỗi không
	// TH1: Tự code ra
	// TH2: Dùng hàm có sẵn
	public static void main(String[] args) {
		char letter = 'a';
		System.out.println(letter + " is digit ? --> " + isDigit(letter));
//		System.out.println(letter + " is digit ? --> " + Character.isDigit(letter) );

		System.out.println("\n======================\n");

		String sequence = "125555"; // 156
		isNumber(sequence);
		System.out.println(" is number --> " + isNumber(sequence));
		System.out.println(" is number --> " + sequence.matches("\\d+"));
		//[0-9]: Thỏa mãn 1 kí tự bất kì từ 0 đến 9
		//[0-9] <=> \d "\\d"
		//{1,}: 1 hoặc nhiều kí tự <=> +
		// Kết hợp: [0-9}{1,} hoặc \\d+
		
		// Thập phân 182.1122 regex = "\\d+.\\d+"
	}

	// index(int) 0 1 2 3
	// value(char) 1 2 x 5
	// 1 2 x 5
	private static boolean isNumber(String input) {
		for (int i = 0; i < input.length(); i++) {
			char temp = input.charAt(i);
			// if (isDigit(temp) == true) <=> if(isDigit(temp))
			// if (isDigit(temp) == false) <=> if(!isDigit(temp))
			if (!isDigit(temp)) {
				return false;
			}
		}
		return true;
	}

//	private static boolean isDigit(char input) {
//		if(input >= '0' && input <= '9') {
//			return true;
//		}
//		return false;
//	}

	private static boolean isDigit(char input) {
		return (input >= '0' && input <= '9');
	}
}
