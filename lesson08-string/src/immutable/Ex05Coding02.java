package immutable;

/**
1. Kiểm tra s1 có phải là chuỗi bắt đầu || kết thúc trong chuỗi s không
2. Thay thế chuỗi s1 bằng chuỗi s2 trong chuỗi s
3. Loại bỏ các khoảng trắng thừa của chuỗi s3
4. Tạo chuỗi con s4 từ chuỗi s bắt đầu từ vị trí số 2
5. Xác định chuỗi s2 có tồn tại trong chuỗi s1 hay không
 * */
public class Ex05Coding02 {
	public static void main(String[] args) {
		String s = "today is a good day";
		String s1 = "day";
		
		//1. Kiểm tra s1 có phải là chuỗi bắt đầu || kết thúc trong chuỗi s không
		System.out.println("s1 startsWith s: " + s.startsWith(s1));
		System.out.println("s1 endsWith s: " + s.endsWith(s1));
		
		//2. Thay thế chuỗi s1 bằng chuỗi s2 trong chuỗi s
		s1 = "good";
		String s2 = "great";
		System.out.println("new String: " + s.replace(s1, s2));
		
		//3. Loại bỏ các khoảng trắng thừa của chuỗi s3
		String s3 = "hope     you  have a great working    day";
		System.out.println("s3:" + s.replaceAll("\\s+", " "));
		
		//4. Tạo chuỗi con s4 từ chuỗi s bắt đầu từ vị trí số 2
		System.out.println("s4: " + s.substring(2));
		System.out.println("s4: " + s.substring(2,7));
		
		//5. Xác định chuỗi s2 có tồn tại trong chuỗi s1 hay không
		System.out.println("contains: " + s1.contains(s2));
	}
}
