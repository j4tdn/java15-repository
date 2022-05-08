package view;

public class Ex01Power {

	public static void main(String[] args) {
		int[] numbers = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
		for (int number : numbers) {
			boolean isPower = isPowerOf2(number);
			System.out.println("==> " + isPower);
		}
		System.out.println("================");
		System.out.println("8,2: "+ isPower(8, 2));
		System.out.println("7,2: "+ isPower(7, 2));
		System.out.println("2,8: "+ isPower(2, 8));

	}

	private static boolean isPowerOf2(int number) {
		// log(number)/log(2) = SN ?
		double log = Math.log(number) / Math.log(2);
		return Math.ceil(log) == Math.floor(log);
	}

	private static boolean isPower(int a, int b) {
		// log(number)/log(2) = SN ?
		double log = a > b ? Math.log(a) / Math.log(b) : Math.log(b) / Math.log(a);
		return Math.ceil(log) == Math.floor(log);
	}

}
