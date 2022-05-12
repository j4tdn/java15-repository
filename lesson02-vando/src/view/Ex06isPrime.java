package view;

public class Ex06isPrime {
	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		int number = 1500, dem = 0;
		for (int i = 0; i < number; i++) {
			if (isPrime(i) == true) {
				dem++;
				if(dem == 15 ) {
					System.out.println(i);
				}
			}
			
		}
		

	}
}