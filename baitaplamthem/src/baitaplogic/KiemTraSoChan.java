package baitaplogic;

public class KiemTraSoChan {
	public static void main(String[] args) {
		System.out.println(check(2486));
	}
	private static boolean check(int n) {
		while (n > 0) {
			int m = n % 10;
			n /= 10;
			if (m % 2 != 0) {
				return false;
			}
		}
		return true;
	}
}
