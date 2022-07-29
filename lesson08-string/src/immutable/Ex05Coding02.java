package immutable;
/***
 * Kiểm tra kí tự, chuỗi bắt đầu, kết thúc trong chuỗi s có phải là s1 không.
• Thay thế chuỗi s1 bằng chuỗi s2 trong chuỗi s
• Loại bỏ các khoảng trắng thừa của chuỗi s3
• Tạo chuỗi con s4 từ chuỗi s bắt đầu từ vị trí số 2
• Xác định chuỗi s2 có tồn tại trong chuỗi s1 hay không
 * @author ADMIN
 *
 */
public class Ex05Coding02 {
  public static void main(String[] args) {
	String s = "today is a good day ";
	String s1 = "day";
	System.out.println("startsWith: " +s.startsWith(s1));
	System.out.println("endsWith: " +s.endsWith(s1));
	//2.
	s1= "good";
	String s2 = "great";
	s= s.replace(s1, s2);
	System.out.println("s replace:" + s);
	
	//3. 
	String s3 = "hope  you   have a great working  day";
	s = s.replaceAll("\\s{1,}", "");
	System.out.println("s3 " +s3);
	
	//4
	 s2 = s.substring(2,6);
	 System.out.println("s2: " +s2);
	 System.out.println("contains: " + s1.contains(s2));
	 
}
}
