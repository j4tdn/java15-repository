package structure;

public class Ex11 {
	//1.kiểm tra kí tự hay 2. chuỗi nhập vào có phải là số hay không?
	//th1 tự code ra
	//th2 dùng hàm có sẵn
	public static void main(String[] args) {
		char letter = 'a';
		System.out.println(letter + " is digit ? -->"+ isDigit(letter));
		System.out.println(letter + " is digit ? -->"+ Character.isDigit(letter));
	
		System.out.println("\n==============\n");
		
		String sequence = "12555";
		System.out.println(sequence+" is Nember-->"+isNumber(sequence));
		System.out.println(sequence+" is Nember-->"+sequence.matches("[0-9]{1,}"));
		//[0-9] thỏa mãn 1 kí tự bất kì từ 0 đến 9
		//[0-9] <=> \d "\\d"
		//{1,} 1 hoặc nhiều kí tự
		//{1,} <=> +
		//kết hợp : [0-9]{1,} hoặc \\d+
		//số âm,thập phân : -182.6272 regex="-?\\d+.\\d+"
		//regex : biểu thức chính quy là tập hợp các quy tắc, cú pháp cho chuỗi
	}
	
	//input.length() -->lấy độ dài của chuỗi
	// index(int)   0 1 2 3
	// value(char)  1 2 x 5
	private static boolean isNumber(String input) {
		for(int i =0;i<input.length();i++) {
			char tmp = input.charAt(i);
			//System.out.println(i+":"+tmp);
			//if (isDigit(tmp)==true)==> if(isDigit(tmp))
			//if (isDigit(tmp)==false)==> if(!isDigit(tmp))
			if (!isDigit(tmp)) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean isDigit (char input) {
		return (input >='0' && input <='9');
	}
	
}