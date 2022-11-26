package view;

public class Ex02 {
	public static void main(String[] args) {
		System.out.println(isPowerOf(2, 16));
	}
	private static boolean isPowerOf(int a, int b) {		
		double power = a > b ? Math.log(a)/Math.log(b) : Math.log(b)/Math.log(a) ;
	    return Math.floor(power) == Math.ceil(power);
	}
}
