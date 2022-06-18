package ex02;

public class Main {
	public static void main(String[] args) {
		int[] arr = { 1, 5, 7, 10, 12, 20, 15, 13, 14, 90, 21, 35, 70, 210, 150, 140, 9, 8, 2 };

		printNumbers(arr, numbers -> numbers % 7 == 0);
		printNumbers(arr, numbers -> (numbers % 5 == 0) && (numbers % 7 == 0));
		printNumbers(arr, numbers -> numbers % 5 == 0);

	}

	public static void printNumbers(int[] arr, Condition condition) {
		for (int i = 0; i < arr.length; i++) {
			if (condition.test(arr[i])) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println("\n=====================");
	}
}
