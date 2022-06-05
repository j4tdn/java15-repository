package ex01;

public class Ex01 {
	public static void main(String[] args) {
		int a = 2;
		int b = 8;
		int c = 3;
		int d = 4;
		System.out.println(isPowerOf(a, b));
		System.out.println(isPowerOf(c, d));
	}

	public static boolean isPowerOf(int a, int b) {
		double loga = Math.log(a) / Math.log(b);
		int logna = (int) (Math.floor(loga));
		double logb = Math.log(b) / Math.log(a);
		int lognb = (int) (Math.floor(logb));
		if (loga - logna == 0 || logb - lognb == 0)
			return true;
		else
			return false;
	}
}
