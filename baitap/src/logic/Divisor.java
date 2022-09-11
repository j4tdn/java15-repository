package logic;

public class Divisor {
	public static void main(String[] args) {
		isDivisor(1000293);
	}
	private static void isDivisor(int n) {
		
		for (int i = 1; i <= Math.sqrt(n); i++) {
			if(n % i == 0 && isPrime(i)) {
				System.out.print(i + " ");
				
			}
		}
	
		
	}
	private static boolean isPrime(int n) {
		if( n < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
