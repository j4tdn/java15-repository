package immutable;
/**
 * 1. Kiểm tra chuỗi s1 có phải là chuỗi bắt đầu || kết thúc trong chuỗi s không
 * 2. Thay thế chuỗi s1 bằng chuỗi s2 trong chuỗi s 
 * 3. Loại bỏ các khoảng trắng thừa của chuỗi s3 
 * 4. Tạo chuỗi con s4 từ chuỗi s bắt đầu từ vị trí số 2 
 * 5. Xác định chuỗi s2 có tồn tại trong chuỗi s1 hay không
 */
public class Ex05Coding02 {
	public static void main(String[] args) {
		String s = "today is a good day";
		String s1 = "day";
		//1.
		if(s.endsWith(s1) == true || s.startsWith(s1)) System.out.println("ex01: YES" );
		else System.out.println("ex01: NO");
		
		//2.
		s1 = "good";
		String s2 = "great";
		
		s = s.replace(s1, s2);
		System.out.println("ex02: " + s);
		//3. regex --> regular expression biểu thức chính quy
		String s3 = "hope you      have a great working   day";
		System.out.println(s3.replaceAll("\\s+", " ")); // phía trước là 1 hoặc nhiều kí tự /s
		
		//4.
		String s4 = s.substring(2);
		System.out.println(s4);
		
		//5.
		System.out.println(s1.contains(s2));
	}
}
