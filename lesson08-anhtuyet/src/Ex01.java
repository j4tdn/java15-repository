import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		String s = "My name is Ánh Tuyết";
		printString(s);
	}
	private static void printString(String s) {
		//In ra mỗi kí tự trên một dòng
		String formatted = s.trim().replaceAll("\\s+", "");
		for(int i = 0; i < formatted.length();i++){
			System.out.println(formatted.charAt(i));
			}
		//In ra mỗi từ trên mỗi dòng
		System.out.println("===========================");
		String [] sa = s.split("\\s+");
		for(String sab : sa) {
			
			System.out.println(sab);
		}
		// in ra chuỗi đảo ngược theo từ
		System.out.println("===========================");
		for(int i = s.length() -1; i >=0; i--) {
			System.out.println(s.charAt(i));
		}
		System.out.println();
		
		System.out.println("===========================");
		// in ra chuỗi đảo ngược theo kí tự
		StringBuffer stringBuffer = new StringBuffer(s);
        System.out.println(stringBuffer.reverse().toString());
		
	}
}
