package vew;

import java.util.Random;

public class Ex02 {
	public static void main(String[] args) {
		Random rd = new Random();
		int a = rd.nextInt(1,10);
		System.out.println("n= " + a);
		int [] b = new int[a];
		for (int i = 0; i < a; i ++) {
			b[i] = rd.nextInt(1,100);
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i] + " ");
		}
		int [] arr = new int [b.length];
		FindNumber(b, arr);
		System.out.println();
		for(int i =0; i< arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}
	private static void FindNumber(int [] b , int []arr) {
		int count = 0;
		for (int i = 0; i < b.length; i ++) {
			if(b[i] % 7 ==0 && b[i] % 5 != 0 ) {
				arr[count] = b[i];
				count++;
			}
		}
		for (int i =0; i < b.length; i++) {
			if((b[i] % 7 !=0 && b[i] % 5 !=0) || (b[i] % 7 ==0 && b[i] % 5 ==0)){
				arr[count] = b[i];
				count++;
			}
		}
		for (int i =0; i< b.length; i++) {
			if(b[i] % 7!=0&& b[i] % 5 == 0) {
				arr[count] = b[i];
				count++;
			}
		}
	}
}
