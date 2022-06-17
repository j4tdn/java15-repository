package control;

import java.util.Random;
import bean.MinMaxType;

import javax.print.DocFlavor.SERVICE_FORMATTED;

public class Ex06fileMaxMin {
	public static void main(String[] args) {
		Random rd = new Random();
		int a = rd.nextInt(20);
		int b = rd.nextInt(20);
		int c = rd.nextInt(20);
		int max = findMax(a,b ,c);
		System.out.println(a + "," + b+"," + c);
		System.out.println("max: "+ max);
	}

	/*private static int findMax(int first, int second, int third) {
		int max = 1;
		first = max;
		if (second > first) {
			second = max;
		} else if(third>first){
			third = max;
		}
		return max;
	}

	private static int findMin(int first, int second, int third) {
		int min = 0;
		first = min;
		if (second > first) {
			second = min;
		} else if(third>first){
			third = min;
		}
		return min;
	}
	}}
	/
	 * 
	 */
	private static MinMaxType find(int first, int second, int third)
	{
		int maxValue = findMax(first,second,third);
		int minValue = findMin(first,second,third);
		return new MinMaxType(minValue ,maxValue);
	}
	private static int findMax(int first, int second, int third) {
		return findMax(findMax(first,second),third);
	}
	private static int findMax(int firsst, int second){
		return firsst> second ? firsst : second;
	}
	private static int findMin(int first, int second, int third) {
		return findMin(findMax(first,second),third);}
	private static int findMin(int firsst, int second){
		return firsst> second ? firsst : second;
	}
		
}

