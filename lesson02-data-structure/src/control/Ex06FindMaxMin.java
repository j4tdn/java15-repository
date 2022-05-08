package control;

import java.util.Random;

import bean.MinMaxType;

public class Ex06FindMaxMin {
	public static void main(String[] args) {
		Random rd = new Random();
		int a = rd.nextInt(20);
		int b = rd.nextInt(20);
		int c = rd.nextInt(20);
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println("=====================");
		System.out.println("Max: " + findMax(a,b,c));
		System.out.println("Min: " + findMin(a,b,c));
		System.out.println("=====================");
		System.out.println(find(a,b,c));
	}
	
	private static MinMaxType find(int first, int second, int third) {
		int maxValue = findMax(first, second, third);
		int minValue = findMin(first, second, third);
		return new MinMaxType(minValue, maxValue);
	}
	
	private static int findMax(int first, int second, int third) {
		/*cach1
		if(first > second && first > third) {
			return first;
		}
		if (second > first && second > third) {
			return second;
		}
		return third;
		*/
		
		/*cach 2
		int max = first > second ? first : second;
		if (max < third) {
			max = third;
		}
		*/
		
		/*cach3
		return (first > second ? first : second) > third ? (first > second ? first : second) : third;
		*/
		
		return findMax(findMax(first, second), third);
		
	}
	
	private static int findMax(int first, int second) {
		return first > second ? first : second;
	}
	
	private static int findMin(int first, int second, int third) {
		return findMin(findMin(first, second), third);
	}
	
	private static int findMin(int first, int second) {
		return first < second ? first : second;
	}
}
