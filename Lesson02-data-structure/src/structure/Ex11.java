package structure;

public class Ex11 {
// Kiem tra nhung ki tu nhap vao co phai la so hay khong
// Kiem tra nhung chuoi nhap vao co phai la so hay khong
// TH1 : TU CODE RA
// TH2 : Dung ham co san
	public static void main(String[] args) {
        char letter = 'x';
        System.out.println(letter + " is digit ? --> " + isDigit(letter));
        System.out.println(letter + " is digit ? --> " + Character.isDigit(letter));
        
         System.out.println("\n=======================================================\n");
	String sequence = "12x5" ; //156
	System.out.println(sequence + " is number --->" + isNumber(sequence));
	System.out.println(sequence + " is number --->" + sequence.matches("\\d+"));
	// [0-9] : Thoa man 1 ki tu bat ki la so tu 0-9
	// [0-9] <=> \d : ky tu dac biet 
	// {1,} : 1 hoac nhieu ki tu <=> +
	// ket hop [0-9]{1,} <=> \\d+
	// regex : stands for regular expression --> bieu thuc chinh quy la tap hop cac quy tac , cu phap cho chuoi
	// Thập phân : 182.886 regex= "\\d+.\\d+"
	// so am : -188222 regex = "-?\\d+"
	isNumber(sequence);
	}
	private static boolean isNumber(String input) {
		// kiem tra tung ki tu trong String 
		// index ( int ) 0 1 2 3
		// value (char)  1 2 x 5
		// Neu tat ca ki tu la so thi chung to chuoi sequence la so
		for(int i = 0; i < input.length(); i++) {
		char tmp =	input.charAt(i);
	//		System.out.println(i + " :" + tmp);
			if(!isDigit(tmp)) {
				return false;
			}
		} return true;
		
	}
	private static boolean isDigit(char input) {
	return (input >= '0' && input <= '9');
	}
	
}
