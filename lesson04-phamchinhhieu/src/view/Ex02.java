package view;

import java.util.Random;

public class Ex02 {
	public static void main(String[] args) {
		Random rd = new Random();
		int n = rd.nextInt(1,10);
		System.out.println("n = " + n);
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = rd.nextInt(1,100);
		}
		for(int i = 0; i < a.length;i++) {
			System.out.print(a[i] + " ");
		}
		int[] arr = new int[a.length];
		FindNumber(a, arr);
		System.out.println();
		for(int i = 0; i < arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	private static void FindNumber(int[] a, int[] arr){
		int count = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] % 7 == 0 && a[i] % 5 != 0) {
				arr[count] = a[i];
				count++;
			}
		}
		for(int i = 0; i < a.length; i++) {
			if((a[i] % 7 != 0 && a[i] % 5 != 0)|| (a[i] % 7 == 0 && a[i] % 5 == 0)) {
				arr[count] = a[i];
				count++;
			}
		}
		for(int i = 0; i < a.length; i++) {
			if(a[i] % 7 != 0 && a[i] % 5 == 0) {
				arr[count] = a[i];
				count++;
			}
		}
	}
}
