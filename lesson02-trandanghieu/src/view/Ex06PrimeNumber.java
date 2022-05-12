package view;

public class Ex06PrimeNumber {
	public static void main(String[] args) {
		System.out.println(nthPrime(200));
	}
	
	public static int nthPrime(int n) {
	    int i, count;
	    for( i = 2, count = 0; count < n; ++i) {
	        if (isPrime(i)) {
	            ++count;
	        }
	    }
	   
	    return i-1;
	}
	private static boolean isPrime(int n) {
	    if (n % 2 == 0) return n == 2;
	    if (n % 3 == 0) return n == 3;
	    int step = 4, m = (int)Math.sqrt(n) + 1;
	    for(int i = 5; i < m; step = 6-step, i += step) {
	        if (n % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}


}
