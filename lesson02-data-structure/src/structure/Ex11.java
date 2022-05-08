package structure;

public class Ex11 {
	    //kiểm tra kí tự nhập vào có phải là số hay không
		//kiểm tra chuỗi nhập vào có phải là số hay không
	    // ctrl + alt + nút xuống để coppy dòng đưa xún phía dưới
		public static void main(String[] args) {
				char letter = 'x';
				System.out.println(letter + " is digit? " + isDigit(letter));
				System.out.println(letter + " is digit? " + Character.isDigit(letter));
				
				System.out.println("\n==================================================\n");
				
				String s = "12x6"; //
				System.out.println(isNumber(s));
				System.out.println(s.matches("[0-9]{1,}"));
				System.out.println(s.matches("\\d+"));
				//System.out.println(s.matches("\\d+.\\d+"));
				//[0-9]<=> \d
		}
		
		private static boolean isNumber(String input) {
			for(int i=0; i < input.length(); i++) {
				char temp = input.charAt(i);
				if(isDigit(temp) == false ) {return false;}
			}
			return true;
		}
		
		private static boolean isDigit(char input) {
			return (input >= '0' && input <='9');
		}
		
}
