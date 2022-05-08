package structure;

public class Ex11 {
	// 1 kiểm tra kí tự nhập vào có phải số hay không?
	// 2 kiểm tra chuỗi nhập vào có phải số hay không?
	//TH1: tự code
	//TH2: sử dụng hàm có sẵn
	
	public static void main(String[] args) {
		char letter = 'x';
		System.out.println(letter + " is digit ? --> " + isDigit(letter));
		System.out.println(letter + " is digit ? --> " + Character.isDigit(letter));
		
		
		System.out.println("\n=================================\n");
		
		
		String s = "4235"; //156
		System.out.println(s + " is digit ? --> " + isDigit(s));
		System.out.println(s + " is digit ? --> " + s.matches("[0-9]{1,}"));
		System.out.println(s + " is digit ? --> " + s.matches("\\d+"));
		//[0-9] : thỏa mãn 1 ký tự bất kì là số từ 0 đến 9
		// [0 - 9] <=> \d " \\d"
		// {1, } : 1 hoặc nhiều kí tự "+"
		// Kết hợp : [0-9]{1,} or \\d+
		// Thập phân 132.343 regex = "\\d+.\\d+"
	}
	private static boolean isDigit(String input) {
		int dem = 0;
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) >= '0' && input.charAt(i) <= '9') {
					dem ++;
					System.out.println(input.charAt(i));
			}
			
//			char tmp = input.charAt(i);
//			if(!isDigit(tmp)) {
//				return false;
//			}
			
		}
		System.out.println("dem = " + dem);
		if(dem == input.length()) {
			return true;
		}
		return false;
		//return true;

		
	}
	
	private static boolean isDigit(char input) {
		return (input >= '0' && input <= '9');
	}
}
