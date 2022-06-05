package exam;

public class Task01Power {
	public static void main(String[] args) {
		System.out.println(isPowerOf(2, 8));
	}
	public static boolean isPowerOf(int a, int b) {
		if(a > b) {
			for (int i = 1; i < a; i++) {
				if(Math.pow(b, i) == a) {
					return true;
				}
			}
		}
	}
}
