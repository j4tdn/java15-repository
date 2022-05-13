package homework;

public class Ex03 {
	// sodoixung: 121 , 1331.
	public static void main(String[] args) {
		System.out.println("so doi xung la " + sodoixung(1331));
	}
	public static boolean sodoixung(int x) {
		String sdx = "" + x;
		for (int i = 0; i < sdx.length() / 2; i++) {
			if (sdx.charAt(i) != sdx.charAt(sdx.length() - 1 -i))
				return false;
		}
		return true;
	}

}
