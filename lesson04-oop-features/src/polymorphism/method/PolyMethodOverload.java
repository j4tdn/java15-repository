package polymorphism.method;

public class PolyMethodOverload {
	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		int z = 15;
		System.out.println("Sum: " + sum2Nbrs(x, y));
		System.out.println("Sum: " + sum2Nbrs(x, y, z));
	}

	private static float sum2Nbrs(float a, float b) {
		return a + b;
	}

	private static int sum2Nbrs(int a, int b) {
		return a + b;
	}

	private static int sum2Nbrs(int a, int b, int c) {
		return a + b + c;
	}
}
