package immutable;
/**
 1. Kiểm tra chuỗi s1 có phải là chuỗi  bắt đầu|| kết thúc trong chuỗi s  không.
 2. Thay thế chuỗi s1 bằng chuỗi s2 trong chuỗi s
 3. Loại bỏ các khoảng trắng thừa của chuỗi s3
 4. Tạo chuỗi con s4 từ chuỗi s bắt đầu từ vị trí số 2
 5. Xác định chuỗi s2 có tồn tại trong chuỗi s1 hay không
 */
public class Ex05Coding02 {
	public static void main(String[] args) {
		String s = " today is a bad day";
		String s1 = "day";
		
		// 1. Kiểm tra chuỗi s1 có phải là chuỗi  bắt đầu || kết thúc trong chuỗi s  không.
		System.out.println("startsWith: " +  s.startsWith(s1));
		System.out.println("endsWith: " + s.endsWith(s1));
		
		// 2. Thay thế chuỗi s1 bằng chuỗi s2 trong chuỗi s
		s1 = " good";
		String s2 = "great";
		s = s.replace(s1, s2);
		System.out.println("s replace: "  + s);
		
		//3 Loại bỏ các khoảng trắng thừa của chuỗi s3
		//regex --> regular expression
		String s3 = "hope you    have a great working     day";
		s3= s3.replaceAll("\\s+"," ");
		
		System.out.println("s3: " + s3);
		
		//4 Tạo chuỗi con s4 từ chuỗi s bắt đầu từ vị trí số 2
		s1 ="today";
		s2 = s.substring(2,7);
		System.out.println("s2: " + s2);
		
		//5 Xác định chuỗi s2 có tồn tại trong chuỗi s1 hay không
		System.out.println("contain: " + s1.contains(s2));
	}
}
