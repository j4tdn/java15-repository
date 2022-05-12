package control;

import java.util.Random;

import bean.MinMaxType;

public class Ex06FindMaxMin {
	public static void main(String[] args) {
		Random rd = new Random();
		int a = rd.nextInt(20);
		int b = rd.nextInt(20);
		int c = rd.nextInt(20);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("Min = " + findMin(a, b, c));
		System.out.println("Min = " + findMax(a, b, c));
		System.out.println("=============");
		System.out.println(find(a,b,c));

	}

	private static int findMin(int first, int second, int third) {
		int temp = 0;
		if (first < second) {
			temp = first;
		} else
			temp = second;
		
		if (third < temp) {
			temp = third;
		}
		return temp;
	}
	
	private static MinMaxType find(int first, int second, int third){
		int maxValue = findMax(first, second, third);
		int minValue = findMin(first, second, third);
		return new MinMaxType(minValue, maxValue);
	}

//	private static int findMax(int first, int second, int third) {
//		int max = first > second ? first : second;
//		if (max < third) {
//			max = third;
//		}
//		return max;
//	}
	private static int findMax(int first, int second, int third) {
		return findMax(findMax(first,second), third);
	}

	private static int findMax(int first, int second) {
		return first < second ? second : first;
	}
}
