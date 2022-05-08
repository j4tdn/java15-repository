package view;

public class Ex01Pow {
	public static void main(String[] args) {
		int[] numbers = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
		for (int number : numbers) {
			boolean isPow = isPowerOf2(number);
			System.out.println("==> " + isPow);
		}
		System.out.println("===================");
		System.out.println("8-2 -->" + isPower(8, 2));
		System.out.println("7-3 -->" + isPower(7, 3));
		System.out.println("2-8 -->" + isPower(2, 8));
	}

	private static boolean isPowerOf2(int n) {
		// log(n)/log(2) = sn?
		double log = Math.log(n) / Math.log(2);
		System.out.println(n + " ==> " + log);
		// Math.ceil(double) : làm tròn trên
		// Math.floor(double) : làm tròn dưới
		return Math.ceil(log) == Math.floor(log);
	}

	private static boolean isPower(int a, int b) {
		double log = a > b ? Math.log(a) / Math.log(b) : Math.log(b) / Math.log(a);
		return Math.ceil(log) == Math.floor(log);
	}
}
