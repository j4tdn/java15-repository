package polymorphism.method;

public class PolyMethodOverLoad {
	private static int sum(int a, int b) {
		return a+b;
	}
	private static int sum(int a, int b, int c) {
		return a+b+c;
	}
	private static float sum(float a, float b) {
		return a+b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		int y = 10;
		int z = 15;
		System.out.println("sum 2: "+ sum(x,y));
		System.out.println("sum 3: "+ sum(x,y,z));
	}

}
