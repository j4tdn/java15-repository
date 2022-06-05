
public class MissingNumber {
	public static void main(String[] args) {
		int[] Ak = { 3, 2, 1, 6, 5 };
		int n = 6;
		System.out.println("missing number is : " + getMissingNumber(Ak, n));
	}

	private static int getMissingNumber(int[] Ak, int n) {

		int number = 0;
		int missingnumber = (n * (n + 1) / 2);

		for (int i : Ak) {
			number = number + i;

		}
		return missingnumber - number;

	}

}
