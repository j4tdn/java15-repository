package ex01;

public class IsPower {
	public static void main(String[] args) {
		System.out.println(isPowerOf(64, 8));
	}

	private static boolean isPowerOf(int a, int b) {
		if (a == 1 || b == 1) {
			return true;
		}
		if (a == b) {
			return true;
		}
		
		int number = 1;
		for (int i = 0; i < a; i++) {
			number *= b;
			if (number == a) {
				return true;
			}
		}
		return false;
	}
}