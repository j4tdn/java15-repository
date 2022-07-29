package immutable.exercises;

/**
 * • Tính chiều dài của chuỗi s • Nối chuỗi s1 vào chuỗi s • Lấy một ký tự tại
 * vị trí index(3) trong chuỗi s • Duyệt từng phần tử trong chuỗi • Tìm vị trí –
 * chỉ số xuất hiện đầu tiên, cuối cùng của kí tự “a” trong chuỗi s
 * 
 */
public class Ex04 {
	public static void main(String[] args) {
		String s = "JAVA15";
		String s1 = "COURSE";

		// 1. Tính chiều dài của chuỗi s
		System.out.println("length: " + s.length());
		System.out.println("length: " + s1.length());
		// 2. Nối chuỗi s1 vào chuỗi s
		System.out.println(s1 + s);
		// 3. Lấy một ký tự tại vị trí index(3) trong chuỗi s
		System.out.println(s.charAt(3));
		// 4. Duyệt từng phần tử trong chuỗi
		for (int i = 0; i < s.length(); i++) {
			System.out.println("s: " + s.charAt(i));
		}
		// 5. Tìm vị trí – chỉ số xuất hiện đầu tiên, cuối cùng của kí tự “a” trong
		// chuỗi s
		System.out.println("indexOf: " + s.indexOf("A"));
		System.out.println("lastIndexOf: " + s.lastIndexOf("A"));
	}

}
