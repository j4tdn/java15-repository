package view;

import java.util.Scanner;
public class Ex04_MaxOdd {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("========TIM SO LE LON NHAT TRONG DAY SO NGUYEN=======");
		System.out.println();
		System.out.print("Nhap so luong phan tu cua day: ");
		int n = ip.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.print("Nhap phan tu thu " +( i + 1) + ": ");
			arr[i] = ip.nextInt();
		}
		System.out.println();
		System.out.println("==========================");
		System.out.println("So le lon nhat la: " + MaxoddNumber(arr, n));
		
	}
	private static int MaxoddNumber(int arr[], int n) {
		int max = 0;
		for(int i = 0; i < n; i++) {
			if(arr[i] % 2 == 1) {
				if(arr[i] > max) {
					max = arr[i];
				}
			}
		}
		return max;
		
	}
}
