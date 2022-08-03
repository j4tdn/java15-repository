package immutable;
/**
	1. Kiểm tra chuỗi s1 có phải là chuỗi bắt đầu || kết thúc trong chuỗi s không.
	2. Thay thế chuỗi s1 bằng chuỗi s2 trong chuỗi s
	3. Loại bỏ các khoảng trắng thừa của chuỗi s3
	4. Tạo chuỗi con s4 từ chuỗi s bắt đầu từ vị trí số 2
	5. Xác định chuỗi s2 có tồn tại trong chuỗi s1 hay không
 */
public class Ex05Coding02 {
	public static void main(String[] args) {
		String s = "today is a good day";
		String s1 = "day";
		
		System.out.println("s bắt đầu bằng s1: " + s.startsWith(s1));
		System.out.println("s kết thúc bằng s1: " + s.endsWith(s1));

		// 1. Kiểm tra chuỗi s1 có phải là chuỗi bắt đầu || kết thúc trong chuỗi s không.
		
		
		// 2. Thay thế chuỗi s1 bằng chuỗi s2 trong chuỗi s.
		s1 = "good";
		String s2 = "great";
		
		System.out.println(s.replace(s1, s2));
		// 3. Loại bỏ các khoảng trắng thừa của chuỗi s3
		String s3 = "hope you   have a great working   day";
		s3 = s3.replaceAll("\\s{1,}", " ");
		System.out.println(s3);
		
		// 4. Tạo chuỗi con s4 từ chuỗi s bắt đầu từ vị trí số 2
		s1 = "today";
		// s2 = s.substring(2);
		s2 = s1.substring(2, 5);

		System.out.println("s2: " + s2);
		
		// 5. Xác định chuỗi s2 có tồn tại trong chuỗi s1 hay không
		System.out.println("contains: " + s1.contains(s2));
	}
}