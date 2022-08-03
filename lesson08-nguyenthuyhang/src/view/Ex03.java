package view;

import java.text.Normalizer;
import java.util.regex.Pattern;

public class Ex03 {
	public static void main(String[] args) {
		String s = "Em có yêu anh không anh để anh biết còn chờ\r\n"
				+ "Em xin lỗi em đã có thái độ không đúng với anh";
		System.out.println(removeAccent(s));
	}
	private static String removeAccent(String s) {
		try {
			 String temp = Normalizer.normalize(s, Normalizer.Form.NFD);
			  Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
			  return pattern.matcher(temp).replaceAll("");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return null;
		
	}
}
