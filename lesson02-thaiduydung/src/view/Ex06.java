package view;
public class Ex06 {
	public static void main(String[] args) {
		int nth = 200;
		System.out.println("" + nthPrime(nth));
	}

	public static int nthPrime(int nth) {
		int count = 0;
		while(count != nth) {
			for (int i = 2; i > 0; i++) {				
				if (isPrime(i)) {
					count++;
				}
				if (count == nth) {
					return i;
				}
			}
		}
		return 0;
	}

	public static boolean isPrime(int number) {
		int m = (int) Math.sqrt(number);
		for (int i = 2; i <= m; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}