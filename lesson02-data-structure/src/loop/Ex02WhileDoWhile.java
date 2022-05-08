package loop;

public class Ex02WhileDoWhile {
	public static void main(String[] args) {
		int n = 7;
		int i = 0;
		while (i < n) {
			System.out.print(i + " ");
			i += 2;
		}
		i = 0;
		System.out.println();
		while (true) {
			System.out.print(i + " ");
			i += 2;
			if (i >= n) {
				break;
			}
		}
		System.out.println("\nFinished");
		System.out.println("======================");

		int m = 8;
		int k = 0;
		do {
			System.out.print(k + " ");
			k++;
			if (k >= m) {
				break;
			}
		} while (true);
	}
}