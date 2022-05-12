package view;

public class Ex02Factorial {
	public static void main(String[] args) {
		
		System.out.println("Tổng S = 4! +7! +12! +18! ="
		+Factorial(4)+Factorial(7)+Factorial(12)+Factorial(18));
		
	}
	
	private static long Factorial(int n) {
		long  KQ = 1;
		for( int i=1 ; i <= n; i++) {
			KQ = KQ*i;
		}
		return KQ;
	}
		
}
