package view;

public class Ex01Power {
	public static void main(String[] args) {
		int[] numbers = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
		for (int number : numbers) {
			boolean isPower = isPowerOfTwo(number);
			System.out.println("==>" + isPower);
		}
		System.out.println("=======");
		System.out.println(" 8-2" +isPower(8,2));
		System.out.println(" 7-2" +isPower(7,2));
		System.out.println(" 458-2" +isPower(458,2));
	}

	private static boolean isPower(int a, int b) {
		double log = a > b ? Math.log(a) / Math.log(b) : Math.log(b) / Math.log(a);

		return Math.ceil(log) == Math.floor(log);
	}

	private static boolean isPowerOfTwo(int n) {
		// log(n)/log(2)=SN?
		double log = Math.log(n) / Math.log(2);
		System.out.println(n + "==>" + log);
		return Math.ceil(log) == Math.floor(log);
	}
}
