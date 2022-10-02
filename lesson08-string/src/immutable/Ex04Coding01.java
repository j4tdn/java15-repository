package immutable;

/**
 * 1. tính chiều dài của chuỗi S
 * 2. Nối chuỗi s1 vào chuỗi s
 * 3. Lấy một ký tự tại vị trí index(3) trong chuỗi s
 * 4. Duyệt từng phần tử trong chuỗi
 * 5. Tìm vị trị - chỉ số xuất hiện đầu tiên, cuối cùng của kí tự "a" trong chuỗi s
 */
public class Ex04Coding01 {
	public static void main(String[] args) {
		String s = "JAVA15";
		String s1 = "COURSE";
		
		// 1.tính chiều dài của chuỗi S
		System.out.println("chiều dài chuỗi s là: " + s.length());
		// 2. Nối chuỗi s1 vào chuỗi s
		s +=" -" + s1;
		s=s.concat(s1);
		System.out.println("s: " + s);
		// 3. Lấy một ký tự tại vị trí index(3) trong chuỗi s
		System.out.println("index3: " + s.charAt(3));
		// 4. Duyệt từng phần tử trong chuỗi
			for(int i =0; i<s.length();i++) {
				System.out.println("Text: " + s.charAt(i));
			}
		// 5. Tìm vị trị - chỉ số xuất hiện đầu tiên, cuối cùng của kí tự "a" trong chuỗi s
			System.out.println("indexOf: " + s.indexOf("A"));
			System.out.println("lastindexOf: " + s.lastIndexOf("A"));


	}
}
