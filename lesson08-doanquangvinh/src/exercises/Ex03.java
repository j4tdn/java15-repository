package exercises;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập vào chuỗi TIẾNG VIỆT bất kỳ : ");
		String text = ip.nextLine();
		System.out.println(removeAccent(text));
	}

	private static String removeAccent(String text) {
	    text= text.replaceAll("a|á|ã|ạ|à|ả|ă|ắ|ẵ|ằ|ặ|ẳ|â|ẩ|ấ|ẫ|ầ|ậ", "a");
	    text= text.replaceAll("e|ế|ễ|ệ|ề|ể", "e");
	    text= text.replaceAll("o|ó|õ|ọ|ò|ỏ|ơ|ớ|ỡ|ợ|ờ|ở|ô|ố|ỗ|ộ|ồ|ổ", "o");
	    text= text.replaceAll("u|ú|ũ|ụ|ù|ủ|ư|ứ|ữ|ự|ừ", "u");
	    text= text.replaceAll("i|í|ĩ|ị|ì|ỉ", "i");
	    text= text.replaceAll("y|ý|ỹ|ỵ|ỳ|ỷ", "y");
	    text= text.replaceAll("đ", "d");
	    
		return text;
	}
}
