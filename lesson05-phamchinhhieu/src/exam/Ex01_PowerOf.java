package exam;

public class Ex01_PowerOf {
	public static void main(String[] args) {
		System.out.println("8-2 " + isPowerOf2(8, 2));
		System.out.println("7-3 " + isPowerOf2(7, 3));
		System.out.println("2-8 " + isPowerOf2(2, 8));
	}
	private static boolean isPowerOf2(int a, int b) {
		double log = (a > b) ? Math.log(a) / Math.log(b): Math.log(b) / Math.log(a);
		return Math.ceil(log) == Math.floor(log);
		
	}
}
