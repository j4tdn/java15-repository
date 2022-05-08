package structure;

public class Ex11 {
	//1.kiểm tra kí tự nhập vào có phải là số hay k?
	//2.kiểm tra chuỗi nhập vào có phải là số hay k?
	//ctrl alt down
	//Th1: tự code ra
	//Th2: dùng hàm có sẵn
	public static void main(String[] args) {
		char letter = 'a';
		System.out.println(letter +" is digit ? --> "+ isDigit(letter));
		System.out.println(letter +" is digit ? --> "+ Character.isDigit(letter));
		
		System.out.println("\n================\n");
		
		String sequence = "-125555"; //
		System.out.println(sequence + " is number --> "+ isNumber(sequence));
		System.out.println(sequence + " is number --> "+ sequence.matches("-?\\d+"));
		//[0-9]: thỏa mãn 1 ký tự bất kỳ là số từ 0 đến 9
		//[0-9] <=> \d "\\d"
		//{1,}: 1 hoặc nhiều kí tự
		//{1,}: 1 hoặc nhiều kí tự
		//{1,}: <=> +
		//Kết hợp: [0-9]{1,} hoặc \\d+
		//Thập phân: 182.6272 regex ="\\d+.\\d+"
		//reget stands for regular expression --> biểu thức chính quy là tập các quy tắc, cú pháp cho chuỗi
		
		isNumber(sequence);
	}
	//input.length()-> lấy độ dài của chuỗi
	//index(int) 0 1 2 3
	//value(char) 1 2 x 5
	private static boolean isNumber(String input) {
		for(int i = 0; i < input.length(); i++) {
			char tmp = input.charAt(i);
			//if (isDigit(tmp) == true) ==> if (isDigit(tmp))
			//if (isDigit(tmp) == false) ==> if (!isDigit(tmp))
			
			
			if (isDigit(tmp) == false) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean isDigit(char input) {
		return (input>='0'&& input <='9');
		
	}
}
