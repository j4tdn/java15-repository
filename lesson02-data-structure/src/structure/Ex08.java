package structure;

public class Ex08 {
	public static void main(String[] args) {
		int a = 5, b = 7;
		swap(a, b);
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
	
	private static void swap(int c, int d) {
		int tmp = c;
		c = d;
		d = tmp;
	}
}
