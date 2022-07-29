package immutable;

public class Ex04Coding01 {
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("JAVA15");
		StringBuffer s1 = new StringBuffer("COURSE");
		int length = s.length();
		int lenngth = s1.length();
		s.append(s1);
		s.charAt(3);
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));

		}
		System.out.println("indexOf :" + s.indexOf("A"));
		System.out.println("indexOf :" + s.lastIndexOf("A"));

	}
}
