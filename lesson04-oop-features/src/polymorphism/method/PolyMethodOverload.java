package polymorphism.method;

public class PolyMethodOverload {
	private static int sum(int a, short b) {
		return a + b;
	}
	private static int sum(int a, byte b) {
		return a + b;
	}
	private static float sum(float a, float b) {
		return a + b;
	}
	private static float sum(float a, float b, float c) {
		return a + b + c;
	}
	
	public static void main(String[] args) {
		
	}
}
