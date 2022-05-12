package view;

public class Ex06FindPrimeNumber {
	public static void main(String[] args) {
		int i = 0;
		int number = 0;
		int result = 0;
		while(i < 200) {
			if(isPrime(number)) {
				result = number;
				i++;
			}
			number++;
		}
		System.out.println("200th prime number: " + result);
	}
	
	private static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		}
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
