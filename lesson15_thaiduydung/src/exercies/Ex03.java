package exercies;

public class Ex03 {

	static boolean isHappynumber(int n) {
		if (n == 1 || n == 7)
			return true;
		int sum = n, x = n;

		while (sum > 9) {
			sum = 0;

			while (x > 0) {
				int d = x % 10;
				sum += d * d;
				x /= 10;
			}
			if (sum == 1)
				return true;
			x = sum;
		}
		if (sum == 7)
			return true;
		return false;
	}

	public static void main(String[] args) {
		int n = 28;
		if (isHappynumber(n))
			System.out.println(n + " is a Happy number");
		else
			System.out.println(n + " is not a Happy number");
	}
}
