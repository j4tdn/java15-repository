package view;

public class HappyNumber {
	public static void main(String[] args) {
		System.out.println(isHappyNumber(100));
		
	}
	private static boolean isHappyNumber(int n) {
		if (n < 1) return false;
		if (n == 1) return true;
		if (n == 4) return false;
		int sum = 0;
		while (n > 0) {
			sum += (n % 10) * (n % 10);
			n /= 10;
		}
		return isHappyNumber(sum);
		
	}
}
