package homework;

public class Task06PrimeNumber {
	public static void main(String[] args) {
		
		int[] primeNumbers = new int[200];
		int count = 0;
		for (int i = 0; count <= 200; i++) {
			if(isPrimeNumber(i) == true) {
				
				count++;
				if(count == 200) {
					System.out.println(i);
				}
			}
		
		}
		
	}
	
	private static boolean isPrimeNumber(int x) {
		boolean isPrime = false;
		if(x < 2) {
			return isPrime;
		}
		for (int i = 2; i <= x/2; i++) {
			if(x % i == 0) {
				return isPrime;
			}
		}
		return isPrime = true;
	}
}