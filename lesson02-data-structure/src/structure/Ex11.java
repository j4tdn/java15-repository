package structure;

public class Ex11 {
	// kiểm tra kí tự nhập vào có phải là số hay không
	// kiểm tra chuỗi nhập vào có phải là số hay không
	//TH1: tự code ra
	//TH2: dùng hàm có sẵn
	public static void main(String[] args) {
		char letter = 'a';
		System.out.println(letter + " is digit ? --> " + isDigit(letter));
		System.out.println(letter + " is digit ? --> " + Character.isDigit(letter));
		
		System.out.println("\n===================================\n");
		
		String sequence = "12x75";
		System.out.println(sequence + " is digit ? --> " + isNumber(sequence));
		System.out.println(sequence + " is digit ? --> " + sequence.matches("[0-9]{1,}"));
		System.out.println(sequence + " is digit ? --> " + sequence.matches("//d+"));
		//[0-9]: thỏa mãn 1 ký tự bất kỳ là số từ 0 đến 9
		//[0-9] <=> \d "\\d"
		//{1,}: 1 hoặc nhiều kí tự
		//{1,}: +
		//kết hợp: [0-9]{1,} hoặc //d+
		//regex: stands for regular expression --> biểu thức chính quy là tập các quy tắc, cú pháp cho chuỗi
		
		//số âm: -32453 regex = "-?\\d+"
		//thập phân: 182.4323 regex = "\\d+.//d+"
		
	}
	
	private static boolean isDigit(char input) {
		return (input >= '0' && input <= '9');
	}
	
	private static boolean isNumber(String input) {
		for(int i = 0; i < input.length() ; i++) {
			char tmp = input.charAt(i);
			//if (isDigit(tmp) == true) ==> if (isDigit(tmp))
			//if (isDigit(tmp) == false) ==> if (!isDigit(tmp))
			
			if (!isDigit(tmp)) {
				return false;
			}
		}
		return true;
	}
	
}
