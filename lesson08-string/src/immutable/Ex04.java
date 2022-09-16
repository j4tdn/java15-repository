package immutable;

public class Ex04 {
	public static void main(String[] args) {
		String s = "JAVA15";
		String s1 = "COURSE";
		
		// Tinh chieu dai cua chuoi s
		System.out.println("chieu dai cua chuoi s la :"+ s.length());
		System.out.println("chieu dai cua chuoi s la :"+ s1.length());
		// Noi chuoi
		s = s + s1;
		//s = s.concat(s1);
		System.out.println("Chuoi ki tu la "+ s);
		// 
		System.out.println("index :"+ s.charAt(3));
		//
		for (int i = 0 ; i<s.length();i++) {
			System.out.println("Text "+ s.charAt(i));
		}
		
		// 
		System.out.println("IndexOf : "+ s.indexOf("a"));
		System.out.println("IndexOf :"+ s.lastIndexOf("A"));
	
	}
}
