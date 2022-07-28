
public class BkitAva04 {
	
	public static void concat1(String s1) {
		System.out.println(System.identityHashCode(s1));
		s1 += "ava04";
		System.out.println(System.identityHashCode(s1));
	}

	public static void concat2(StringBuilder s2) {
		s2.append("ava04");
	}
	
	public static void concat3(StringBuffer s3) {
		s3.append("ava04");
	}
	
	public static void main(String[] args) {
		String s1 = "bkit";
		concat1(s1);
		System.out.println(s1);
		
		StringBuilder s2 = new StringBuilder("bkit");
		concat2(s2);
		System.out.println(s2);
		
		StringBuffer s3 = new StringBuffer("bkit");
		concat3(s3);
		System.out.println(s3);
	}
}
