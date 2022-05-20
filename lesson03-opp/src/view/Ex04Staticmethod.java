package view;

public class Ex04Staticmethod {
	public static void main(String[] args) {
		int a = 5;
		int b = 10 ;
	System.out.println("r1: "+Ex04Staticmethod.sum(a, b));
	System.out.println("r2: "+sum(a, b));
	System.out.println("r3: "+sum(a, b));

	}
	// static : not dêpnds of calling object 
	// : depends of class
	// non static : depends on calling object
	private static int sum (int a , int b) {
		return a+b;
	}
}
