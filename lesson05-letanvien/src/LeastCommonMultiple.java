
public class LeastCommonMultiple {
	public static void main(String[] args) {
		int[] list = new int[] { 2, 3, 4 };

		System.out.println("Least Common Multiple Is : " + getLeastCommonMultiple(list));

	}

	public static int getLeastCommonMultiple(int[] list) {
		int a = 2 * 3;
		int b = 2 * 4;
		int c = 3 * 4;
		if (a < b || b < c || a < c)
			;
		return c;
	}
}
