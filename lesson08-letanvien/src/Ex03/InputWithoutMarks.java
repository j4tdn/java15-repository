package Ex03;

import java.text.Normalizer;
import java.util.regex.Pattern;

public class InputWithoutMarks {

	public static void main(String[] args) {
		String str = "Em có yêu anh không anh để anh biết còn chờ";
		String str2 = "Em xin lỗi em đã có thái độ không đúng với anh";
		System.out.println(removeAccent(str));
		System.out.println(removeAccent(str2));
	}

	private static String removeAccent(String str) {
		String temp = Normalizer.normalize(str, Normalizer.Form.NFD);
		Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
		String result = pattern.matcher(temp).replaceAll("");
		return result;
	}
}
