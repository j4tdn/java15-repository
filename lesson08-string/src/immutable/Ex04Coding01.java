package immutable;

public class Ex04Coding01 {
	public static void main(String[] args) {
		String s = "JAVA15";
		String s1 = "COURSE";

		System.out.println(s.length());
		s = s.concat(s1);
		System.out.println(s.charAt(3));
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		System.out.println("indexOf: " + s.indexOf("A"));
		System.out.println("lastIndexOf: " + s.lastIndexOf("A"));
	}

}
