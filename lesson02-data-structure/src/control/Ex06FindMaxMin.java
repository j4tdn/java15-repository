package control;

import java.util.Random;

import bean.MinMaxType;

public class Ex06FindMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random(); // tao moi doi tuong Random
		int a = rd.nextInt(20); // tra ve mot so nguyen bat ki
		int b = rd.nextInt(20);	
		int c = rd.nextInt(20);

		System.out.println(a + "," + b + "," + c);
		System.out.println("Max:" + findMax(a, b, c));
		System.out.println("Min:" + findMin(a, b, c));
		System.out.println("=================");
		System.out.println(find(a, b, c));

	}
	private static MinMaxType find(int firt, int second, int third) {
		int maxValue = findMax(firt, second, third);
		int minValue = findMin(firt, second, third);
		return new MinMaxType(minValue, maxValue);
	}

	private static int findMax(int firt, int second, int third) {
		return findMax(findMax(firt, second), third);
	}

	private static int findMax(int firt, int second) {
		return firt > second ? firt : second;
	}

	private static int findMin(int firt, int second, int third) {
		return findMin(findMin(firt, second), third);
	}

	private static int findMin(int firt, int second) {
		return firt < second ? firt : second;
	}

//		int max = firt;
//		
//		if(max < second) {
//			max = second;
//		}else {
//			if(max < third) {
//				max = third;
//			}
//		}
//		return max;

}
