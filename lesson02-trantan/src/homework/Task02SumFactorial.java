package homework;

public class Task02SumFactorial {
	public static void main(String[] args) {
		long sumFactorial = convertFactorial(4) + convertFactorial(7) +convertFactorial(12) + convertFactorial(18);
		System.out.println("sum factorial: " + sumFactorial);
		
	}
	public static long convertFactorial(int x) {
		long ft = 1;
		for (int i = 2; i <= x; i++) {
		ft *= i;
		}
		return ft;
	}
	
}
