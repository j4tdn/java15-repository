package ex01;

public class IsPower {
	public static void main(String[] args) {
		int a = 4;
		int b = 64;
		System.out.println(isPowerOf(a, b));
	}

	private static boolean isPowerOf(int a, int b) {
		if (a > b) {
			while (a > 0) {
				a = a / b;
				if (a == b) {
					return true;
				}
			}
		} else if (a < b) {
			while (b > 0) {
				b = b / a;
				if (a == b) {
					return true;
				}
			}
		}
		return false;
	}
}
