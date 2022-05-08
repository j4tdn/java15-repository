package structure;

public class Ex11 {
	// Kiểm tra kí tự nhập vào có phải là số hay k
	// kiểm tra chuỗi nhập vào có phải là số hay k
	// TH1: Tự code ra
	// TH2: Dùng hàm có sẵn
	public static void main(String[] args) {
		char letter = 'x';
		System.out.println(letter + " is digit? -> " + isDigit(letter));
		System.out.println(letter + " is digit? -> " + Character.isDigit(letter));

		System.out.println(" \n ======================= \n");
		String sequence = "12x5";
		System.out.println( sequence + " is Number -> " + isNumber(sequence));
		System.out.println( sequence + " is Number -> " + sequence.matches("\\d+"));
		// [0-9] thỏa mãn 1 kí tjw bất kì là số từ 0-9
		// [0-9] <=> \d
		// {1,} : 1 hoặc nhiều kí tự
		//{1,} <=> +
		//regex stands for regular expression : biểu thức chính quy tập các quy tắc, cú pháp cho chuỗi
		// Kết hợp:[0-9]{1,} hoặc \\d+

	}

	private static boolean isDigit(char input) {
		return (input >= '0' && input <= '9');

	}
// index(int) 0 1  2 3 
// value(char) 1 2  x 5 
//if(isDigit(tmp)==true)=>if(isDigit(tmp))
//if(isDigit(tmp)==false)=> if(!isDigit(tmp))
	private static boolean isNumber(String input) {
		for(int i=0; i<input.length(); i++) {
			char tmp=input.charAt(i);
			if(isDigit(tmp)==false)
			{
				return false;
			}
		}
		return true;

	}

}
