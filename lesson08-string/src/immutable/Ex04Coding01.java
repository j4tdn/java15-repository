package immutable;
/*
 * 1. Tính chiều dài chuỗi s
 * 2. Nối chuỗi s1 với s
 * 3. lấy 1 phần tử tại index 3 trong s
 * 4. Duyệt từng phần tử trong chuỗi
 * 5. Tìm vị trí chữ "a" xuất hiện đầu và cuối
 */
public class Ex04Coding01 {
	
	public static void main(String[] args) {
		String s = "JAVA15";
		String s1 = "COURSE";
		//1. Tính chiều dài chuỗi s
		System.out.println("length of s : " + s.length());
		//2. Nối chuỗi s1 với s
		String s2 = s +" " + s1 ; 
		System.out.println(s2);
		//3. Lấy kí tự
		System.out.println(s.charAt(3));
		//4.duyệt
		for(int i = 0; i< s.length();i++) System.out.println(s.charAt(i));
		//5.Tìm vị trí
		System.out.println(s.indexOf("A"));
		System.out.println(s.lastIndexOf("A"));
	}
	

}
