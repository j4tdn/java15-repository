
public class test {
	public static void main(String[] args) {
		String s1 = "bkit-java";
		String test = "bkit";
		test += "-java";
		System.out.println("1: " + (test.intern()==s1.intern()));
	}
}
