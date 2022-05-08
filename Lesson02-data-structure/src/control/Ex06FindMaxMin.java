package control;

import java.util.Random;

public class Ex06FindMaxMin {
 public static void main(String[] args) {
	Random rd = new Random();
	int a = rd.nextInt(20);
	int b = rd.nextInt(20);
	int c = rd.nextInt(20);
//	int result = Math.max(a, b);
//	int sequence = Math.max(result, c);
	findMax(a,b,c);
	findMin(a,b,c);
	System.out.println(a +" " + b + " " + c);
//	System.out.println(sequence + "isMax");
	System.out.println("Max : " + findMax(a,b,c) );
	System.out.println(a +" " + b +" " +c );
	System.out.println("Min :" + findMin(a,b,c));
	System.out.println(find(a,b,c));
	
}
 private static int findMax(int first , int second , int third) {
	 return findMax(findMax(first , second), third);
 }
 private static  int findMax(int first , int second) {
	 return first > second ? first : second;
 }
 private static int findMin ( int first , int second , int third) {
	 return findMin(findMin(first,second),third);
 }
 private static int findMin (int first , int second) {
	 return first < second ? first : second;
 }
 private static MinMaxType find(int first , int second , int third) {
	 int maxValue = findMax(first,second,third);
	 int minValue = findMin(first , second , third);
	 return new MinMaxType(minValue , maxValue);
 }
}

