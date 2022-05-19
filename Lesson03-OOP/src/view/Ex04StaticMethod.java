package view;

public class Ex04StaticMethod {

	public static void main(String[] args) {
            int a = 5;
            int b = 10;
     System.out.println("r1" + Ex04StaticMethod.sum(a, b));
     System.out.println("r2" + sum(a, b));
     System.out.println("r3" + sum(a, b));
	}
     // static : not depend on calling objects => depend on class
	 // non-static : depend on calling objects
	 private static int sum(int a , int b) {
		 return a + b;
	 }
}
