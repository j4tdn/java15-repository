package view;
import java.util.Scanner;

public class Ex01IsPower {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter the first number :");
		int a = ip.nextInt();
		System.out.print("Enter the second number :");
		int b = ip.nextInt();
		isPowerOf(a, b);
		// System.out.println(isPowerOf(a, b));
		System.out.println(isPowerOf(a, b) );
	}

	private static boolean isPowerOf(int a, int b) {
		double log = a > b ? Math.log(a) / Math.log(b) : Math.log(b) / Math.log(a);
		
		return Math.ceil(log) == Math.floor(log);
	}
}