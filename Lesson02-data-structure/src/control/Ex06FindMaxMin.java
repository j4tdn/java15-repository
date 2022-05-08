package control;

import java.util.Random;

import bean.MinMaxType;

public class Ex06FindMaxMin {
public static void main(String[] args) {
	Random rd = new Random();
	int a =rd.nextInt(20);
	int b =rd.nextInt(20);
	int c =rd.nextInt(20);
System.out.println( a+" "+b +" " +c);
System.out.println("MAX:" + findMax(a, b, c));
System.out.println("MIN:"  + findMix(a, b, c));
System.out.println(find(a,b,c));

}
private static MinMaxType find(int first, int second, int third) {
	int maxValue =findMax(first, second, third);
			int mixValue =findMix(first, second, third);
return new MinMaxType(mixValue, maxValue);
}
private static int  findMax(int first, int second, int third) {
return findMax(findMax(first, second), third);
}
private static int findMax(int first, int second) {
	return first > second? first :second;
}
private static int  findMix(int first, int second, int third) {
	return findMix(findMix(first, second), third);
}
private static int findMix(int first, int second) {
	return first < second? first :second;
}
}
