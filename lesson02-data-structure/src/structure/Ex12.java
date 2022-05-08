package structure;

public class Ex12 {
	public static void main(String[] args) {
		char letter = 'x';
		System.out.println(letter + " is Digit ? --->" + isDigit(letter));
		System.out.println(letter + " is Digit ? --->" + Character.isDigit(letter));

		System.out.println("\n=====================\n");
		
		String s = "-12356";
		System.out.println(s+" is Number?--->"+ isNumber(s));
		System.out.println(s+" is Number?--->"+ s.matches("-?\\d+"));
		//[0-9]thỏa mãn 1 ky�? tự bâ�?t kì từ 0-9
		//[0-9]<=>\d "\\d"
		//{1,} : 1 hoặc nhiều ki�? tự
		//{1,} <->, = +
		//thập phân: regex ="\\d+.\\d+
		//regex  
	}

	private static boolean isNumber(String s) {
		for (int i = 0; i < s.length(); i++) {
			char tmp = s.charAt(i);
			if (!(tmp >= '0' && tmp <= 9)) {
				return false;
			}
		}
		return true;
	}

	private static boolean isDigit(char i) {
		return i >= '0' && i <= '9';
	}
}
