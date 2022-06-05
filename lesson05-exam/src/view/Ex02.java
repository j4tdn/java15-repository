package view;

/**
 * @author LENOVO 2. Tìm số đặc biệt.
 * 
 */

public class Ex02 {
	public static void main(String[] args) {	
		boolean temp=isSpecialNumber(7);
		if(temp==true) {
			System.out.println("Là số đặc biệt");
		}
		else {
			System.out.println(" Không phải là số đặc biệt");
		}
	}
	public static boolean isSpecialNumber(int n) {
		int sum = 0;
		for (int i = 1; sum <= n && i < n; i++) {
			if (n % i == 0)
				sum += i;
			if (sum == n)
				return true;
		}
		return false;
	}
}
