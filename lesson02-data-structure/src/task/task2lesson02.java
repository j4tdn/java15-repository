package task;

public class task2lesson02 {
	private static long giaithua(int n) {
  	   long mul = 1;
  	   for(int i = 1; i <= n; i++) mul *= i;
  	   return mul;
    }

	public static void main(String[] args) {
       long tong = giaithua(4) + giaithua(7) + giaithua(12) + giaithua(18);
       System.out.println("Result: " + tong);
	}
}
