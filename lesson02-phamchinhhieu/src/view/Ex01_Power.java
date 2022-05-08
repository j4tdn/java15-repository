package view;

public class Ex01_Power {
	public static void main(String[] args) {
		int[] numbers = {0,1,2,3,4,5,6,7,8};
		for(int number : numbers) {
			boolean isPower = isPowerOf2(number);
			System.out.println("=>" + isPower);
		}
		System.out.println("8-2 " + isPowerOf2(8, 2));
		System.out.println("7-3 " + isPowerOf2(7, 3));
		System.out.println("2-8 " + isPowerOf2(2, 8));
	}
	private static boolean isPowerOf2(int a, int b) {
		double log = (a > b) ? Math.log(a) / Math.log(b): Math.log(b) / Math.log(a);
		return Math.ceil(log) == Math.floor(log);
		
	}
	private static boolean isPowerOf2(int number) {

		double log = Math.log(number) / Math.log(2);
		System.out.println(number + "==>" + log);
		return Math.ceil(log) == Math.floor(log);
		
	}
}
