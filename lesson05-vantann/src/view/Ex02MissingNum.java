package view;

public class Ex02MissingNum {
	public static void main(String[] args) {
		int[] numbers = {3, 2, 1, 6, 4};
		System.out.println(findMissingNum(numbers));
	}
	private static int findMissingNum(int[] elements) {
		int N = elements.length+1;
		int sum = N * (N + 1) / 2;
		int sumAr = 0;
		for (int element : elements) {
			sumAr += element;
		}
		return sum - sumAr;
	}
}
