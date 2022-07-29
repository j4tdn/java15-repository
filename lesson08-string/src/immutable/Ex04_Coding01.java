package immutable;

public class Ex04_Coding01 {
	public static void main(String[] args) {
		String s = "JAVA15";
		String s1 = "COURSE";
		
		System.out.println("Leng: " + s.length() + "," + s1.length());
		s += s1;
		System.out.println("indexof: " + s.indexOf("A"));
		System.out.println("lastindexof: " + s.lastIndexOf ("A"));
	}
	
}
