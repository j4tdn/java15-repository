package immutable;

public class Ex04Coding01 {
/*
 * 
 * 
 * 
 * */
public static void main(String[] args) {
	String s = "JAVA15";
	String s1 = "COURSE";
	
	System.out.println("String length s is:" +s.length());
	
	//2 nối chuỗi s1 vào chuỗi s
	System.out.println("Connect string s and s1:" + (s + s1));
	// s = s.concat(s1);// concatenate
	
	//3. lấy ký tự vị trí index 3 trong chuỗi s
	System.out.println("index 3: " +s.charAt(3));
	
	//4. Duyệt từng phần tử trong chuỗi
	for (int i = 0; i < s.length(); i++) {
		System.out.println("Text:" +s.charAt(i));
	}
	
	//5. tìm vị trí chỉ số xuất hiện đầu tiên hay cuối cùng của kí tự a trong chuỗi s
	System.out.println("Indexof :" +s.indexOf("A"));
	System.out.println("lastIndexof :" +s.lastIndexOf("A"));
	
	
}
}
