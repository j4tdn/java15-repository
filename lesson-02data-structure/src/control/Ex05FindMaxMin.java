package control;

import java.util.Random;

import bean.MinMaxType;

public class Ex05FindMaxMin {
	public static void main(String[] args) {
		Random rd = new Random();
		int a = rd.nextInt(20);
		int b = rd.nextInt(20);
		int c = rd.nextInt(20);

		int max = finMax(a, b, c);
		System.out.println(a+ ", " +b+ " , " +c);
		System.out.println("Max: " +max);
		
		int min = finmin(a, b, c);
		System.out.println("Min: " +min);
		System.out.println("====================");
		System.out.println(find(a, b, c));

	}
	private static MinMaxType find(int fisrt, int second, int thirth) {
		int minValue = finmin(fisrt, second, thirth);
		int maxValue = finMax(fisrt, second, thirth);
		return new MinMaxType(minValue, maxValue);
	}

	private static int finMax(int f, int s, int t) {
		return finMax(finMax(f, s), t);
	}

	private static int finMax(int f, int s) {
		return f > s ? f : s;

	}
	private static int finmin(int first, int second,int thirth) {
		return findMin(findMin(first, second), thirth);
	}
	private static int findMin(int first, int second) {
		return first < second ? first : second;
	}

}
