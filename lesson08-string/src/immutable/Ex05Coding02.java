package immutable;
/**
1 Kiểm tra kí tự, chuỗi bắt đầu, kết thúc trong chuỗi s có phải là s1 không.
2 Thay thế chuỗi s1 bằng chuỗi s2 trong chuỗi s
3 Loại bỏ các khoảng trắng thừa của chuỗi s3
4 Tạo chuỗi con s4 từ chuỗi s bắt đầu từ vị trí số 2
5 Xác định chuỗi s2 có tồn tại trong chuỗi s1 hay không
 */
public class Ex05Coding02 {
	public static void main(String[] args) {
		String s="today is a good day";
		String s1="day";
		//1. startWith
			System.out.println(s.startsWith(s1));
			System.out.println(s.endsWith(s1));
		
		//2.replace
		s1="good";
		String s2="great";
		s=s.replaceFirst(s1, s2);
		System.out.println("s:"+ s);
		System.out.println();
		//3. regex -> gegular expression: biểu thức chính quy
		
		String s3="hope you    have a great working     day";
		
		s3=s3.replaceAll("\\s+"," ");
		System.out.println("s3:"+ s3);
		
		//4.
		s2=s.substring(2);
		System.out.println("s2: " + s2);
		
		//5.
		System.out.println("contains: "+ s1.contains(s2)); // => false
	}
}
