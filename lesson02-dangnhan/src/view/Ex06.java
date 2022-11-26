package view;

public class Ex06 {
	public static void main(String[] args) {
		int running = 2;
		int counter = 0;
		
		while(true) {
			if (isPrime(running)) {
				counter++;
				if(counter == 4) {
					break;
				}
 			}
			running++;
		}
		System.out.println(" " +running);
	}
	
	private static boolean isPrime(int n) {
		if ( n== 0 || n ==1) return false;
		
		for (int i = 2;i <= Math.sqrt(n);i++) {
			if( n% i ==0) {
				return false;
			}
		}
		
		return true;
	}
}
