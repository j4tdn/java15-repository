package view;

public class Ex02TinhGiaiThua {

	public static void main(String[] args) {
	
		long result = factorial(4) + factorial(7) + factorial(12) + factorial(18);
				
		
	
		System.out.println("Factorial Total : " + result);
	}

	public static long factorial(int n) {
		long giai_thua = 1;
		if (n == 0 || n == 1) {
			return giai_thua;
		} else {
			for (int i = 1; i <= n; i++) {
				giai_thua *= i;
			}
			return giai_thua;
		}
	}
}
