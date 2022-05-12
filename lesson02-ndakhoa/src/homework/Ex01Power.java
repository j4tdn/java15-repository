package homework;

public class Ex01Power {
	public static void main(String[] args) {
		int[] numbers = { 0, 1, 2, 3, 4, 5, 6, 7, 8};
		for (int number: numbers) {
			boolean isPower = isPowerOf2(number);
			System.out.println("==> " + isPower);
		}
		System.out.println("=========");
		System.out.println("8-2: " + isPower(8, 2));
		System.out.println("7-3: " + isPower(7, 3));
		System.out.println("2-8: " + isPower(2, 8));
	}
	// a=8 b=2 ==> ture
	// a=7 b=2 ==> false 
	private static boolean isPower(int a, int b) {
		double log =  a > b ? Math.log(a) / Math.log(b) : Math.log(a) / Math.log(b);
		return Math.ceil(log) == Math.floor(log);
		
	}
	private static boolean isPowerOf2(int n) {
		// log(n)/log(2) = so nguyen ?
		
		double log = Math.log(n) / Math.log(2);
		System.out.println(n + " ==> " + log);
		return Math.ceil(log) == Math.floor(log);
		
	}

}
