package polymorphism.method;

public class PolyMethodOverload {
	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		int z = 15;
		System.out.println("sum: " + Sum(x, y));
		System.out.println("sum: " + Sum(5.0f, 5.0f));
		System.out.println("sum: " + Sum(x, y, z));
	}
	
	private static int Sum(int a, int b) {
		return a+b;
	}
	private static float Sum(float a, float b) {
		return a+b;
	}
	private static int Sum(int a, int b, int c) {
		return a+b+c;
	}
}	
