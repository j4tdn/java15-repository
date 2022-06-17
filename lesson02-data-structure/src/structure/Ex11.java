package structure;

public class Ex11 {
	// kiểm tra kí tự nhập vào có phải số hay ko
	// kiểu tra chuỗi nhập vào có phải là số hay ko
	
	public static void main(String[] args) {
		char letter ='x';
		System.out.println(letter + " is digit ? ==> " + isDigit(letter));
		System.out.println(letter + " is digit ? ==> " + Character.isDigit(letter));// hàm kiểm tra có phải số hay ko của java
		
		
		String sequence = " 12x5";//
		isNumber (sequence);
		System.out.println(sequence + "    "+ isNumber(sequence));
		System.out.println(sequence + "    "+ sequence.matches("[0-9]{1,}"));

	}
	private static boolean isNumber(String input) {
		for(int i = 0;i < input.length();i++ ){// lấy độ dài các phần tử trong chuỗi 
			char tmp = input.charAt(i);
		System.out.println(i + ": " +tmp);
			if(!isDigit(tmp)) {
				return false;
			}
		}
		return true;
	}
	
	
	private static boolean isDigit(char input) {
	return (input >= 0 && input<= 9);
	}
}
