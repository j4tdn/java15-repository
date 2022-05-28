package polymorphism.method;

public class PolyMethodOverLoad {
	public static void main(String[] args) {
		
		System.out.println(sum(2,3));;
		System.out.println(sum(2,3,4));
		System.out.println(sum(2.0f,3.0f));;
	}
	
	private static int sum(int a, int b) {
		return a + b;
	}
	
	private static int sum(int a, int b, int c) {
		return a + b + c;
	}
	
	private static float sum(float a, float b) {
		return a + b;
	}
}
