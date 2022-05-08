package control;

import java.util.Random;

import bean.MinMaxType;

public class Ex06FindMaxMin {

	public static void main(String[] args) {
		Random rd = new Random();
		int a = rd.nextInt(20); 
		int b = rd.nextInt(20); 
		int c = rd.nextInt(20); 
		System.out.println("Number first: " + a);
		System.out.println("Number second: " + b);
		System.out.println("Number third: " + c);
		System.out.println("FindMax: " + findMax(a, b, c));
		System.out.println("FindMin: " + findMin(a, b, c));
		System.out.println("==============================");
		System.out.println(find(a,b,c));
	}
	private static MinMaxType find(int first, int second, int third) {
		int maxValue = findMax(first, second,third);
		int minValue = findMin(first, second,third);
		return new MinMaxType(minValue, maxValue);
	}
	private static int findMax(int first, int second) {
		return first > second ? first : second;
	}
	private static int findMax(int first, int second, int third) {
		return findMax(findMax(first, second),third);
	}
	private static int findMin(int first, int second) {
		return first < second ? first : second;
	}
	private static int findMin(int first, int second, int third) {
		return findMin(findMin(first, second),third);
	}
	
	
//	private static int findMax(int first, int second, int third) {
//		int max = first > second ? first : second;
//		if(max < third) {
//			max = third;
//		}
//		return max;
//	}
//	private static int findMin(int first, int second, int third) {
//		int min = first > second ? second : first;
//		if(min > third) {
//			min = third;
//		}
//		return min;
//	}
	
//	private static int findMax(int first, int second, int third) {
//		int max;
//		if(first > second && first > third) {
//			max = first;
//		}else if(second > third) {
//			max = second;
//		}else {
//			max = third;
//		}
//		return max;
//	}
//	private static int findMin(int first, int second, int third) {
//		int min;
//		if(first > second && first > third) {
//			min = first;
//		}else if(second > third) {
//			min = second;
//		}else {
//			min = third;
//		}
//		return min;
//	}

}
