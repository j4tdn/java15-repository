package immutable;

/*
 * 	1• Kiểm tra kí tự, chuỗi bắt đầu, kết thúc trong chuỗi s có phải là s1 không.
	2• Thay thế chuỗi s1 bằng chuỗi s2 trong chuỗi s
	3• Loại bỏ các khoảng trắng thừa của chuỗi s3
	4• Tạo chuỗi con s4 từ chuỗi s bắt đầu từ vị trí số 2
	5• Xác định chuỗi s2 có tồn tại trong chuỗi s1 hay không
 * */
public class Ex05Coding02 {
	public static void main(String[] args) {
		String s = "today is a good day";
		String s1 = "day";

		// 1
		System.out.println("isStartwith: " + s.startsWith(s1));
		System.out.println("isEndWith: " + s.endsWith(s1));

		// 2.
		s1 = "good";
		String s2 = "great";
		System.out.println(s.replace(s1, s2));
		// 3. (use regex)

		String s3 = "hope  you    have a great working   day";
		System.out.println(s.replaceAll("\\s+", " "));

		// 4.

		String stringNew = s.substring(2);
		System.out.println(s + " -> " + stringNew);
		
		// 5.
		s2 = "a";
		System.out.println("is exist: " + s.contains(s2));
		
	}
}
