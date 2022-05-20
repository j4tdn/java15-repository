package view;

public class Ex04StaticMethod {

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
//		Ex04StaticMethod o1 = new Ex04StaticMethod();
		System.out.println("r1: "+sum(a,b));
//		System.out.println("r2: "+ o1.sum(a,b));
//		System.out.println("r3: "+ o1.sum(a,b));
	}

	private static int sum(int a, int b) {
		return a + b;
	}

}
