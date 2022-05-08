package loop;

public class Ex02WhileDoWhile {
	public static void main(String[] args) {
		// print out numbers less than N
		int n = 6;
		int i = 0;
		while (i < n) {
			System.out.println(i + " ");
			i += 2;

		}
		i = 0;
		System.out.println("==========");
		while (true) {
			System.out.println(i + "  ");
			i += 2;
			if (i == n) {
				break;
			}
		}
		System.out.println("\tFinished");
	}
	{
	int m = 8;
	int k = 0;
		do
	{
		System.out.println(k + " ");
		k++;
	}while(k<m);
}
}
