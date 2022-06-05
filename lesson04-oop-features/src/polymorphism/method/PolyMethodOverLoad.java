package polymorphism.method;

import javax.management.loading.PrivateClassLoader;

public class PolyMethodOverLoad {
	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		int z = 15;
		System.out.println("sum1:" + sum(5.0f, 2.0f));
		System.out.println("sum2:" + sum(x, y));
		System.out.println("sum3:" + sum(x, y, z));
	}

	private static float sum(float a, float b) {
		return a + b;
	}

	private static int sum(int a, int b) {
		return a + b;
	}

	private static int sum(int a, int b, int c) {
		return a + b + c;
	}
//	private static String sum(int a ,int b , int c) {
//		return "";
//	}

}
