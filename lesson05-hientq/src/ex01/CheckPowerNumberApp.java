package ex01;

import java.util.Scanner;
// Lesson05 Exam KF
// Bai 1: Viết hàm kiểm tra một số có phải là lũy thừa của một số khác không
public class CheckPowerNumberApp {
	private static Scanner sc = new Scanner(System.in);
	public static boolean isPowerOf(int n, int a) {
		for(int i = 0; i <= n; i++) {
			if(n == Math.pow(a, i)) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int n;
		int a;
		System.out.print("Input n: ");
		n = Integer.parseInt(sc.nextLine());
		System.out.print("Input a: ");
		a = Integer.parseInt(sc.nextLine());
		// Neu user input nguoc so thi em se swap hai so voi nhau
		if(a > n) {
			int temp = a;
			a = n;
			n = temp;
		}
		boolean result = CheckPowerNumberApp.isPowerOf(n, a);
		if(result) {
			System.out.println("Yes! " +n + " is power of " + a);
		} else {
			System.out.println("No! "+n + " is not power of " + a);
		}
	}
}
