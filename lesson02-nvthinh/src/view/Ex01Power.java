package view;

public class Ex01Power {

	public static void main(String[] args) {
		int[] numbers = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
		for (int number : numbers) {
			isPowerOf2(number);
			boolean isPower = isPowerOf2(number);
			//System.out.println("===>" + isPowerOf2(number));
			System.out.println("===>" + isPower);
		}
		System.out.println("8-2" + isPower(8,2));
		System.out.println("8-2" + isPower(7,3));
		System.out.println("8-2" + isPower(2,8));
	}
	// 8 2 ==> true
	// 7 3 ==> false
	private static boolean isPower(int a, int b) {
		double log = a > b ? Math.log(a) / Math.log(b) : Math.log(b) / Math.log(a) ;
		return Math.ceil(log) == Math.floor(log);

	}
	
	private static boolean isPowerOf2(int number) {
		// log(number)/ log(2) = số nguyên (SN)
		double log = Math.log(number) / Math.log(2);
		System.out.println(number + " ==> " + log);
		return Math.ceil(log) == Math.floor(log);

}
}
