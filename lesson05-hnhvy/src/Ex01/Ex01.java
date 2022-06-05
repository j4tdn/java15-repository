package Ex01;
import static java.lang.Math.*;

public class Ex01 {
	
	
	public static void main(String[] args) {

		System.out.println(isPowerOf(8, 2));
		System.out.println(isPowerOf(2, 8));
		System.out.println(isPowerOf(6, 2));
		System.out.println(isPowerOf(20, 4));
		System.out.println(isPowerOf(64, 4));
	}
	private static boolean isPowerOf(int a, int b) {
		double log = a > b ? Math.log(a) / Math.log(b) : Math.log(b) / Math.log(a);
		return Math.ceil(log) == Math.floor(log);
	}
	
}