package bai3;

import java.util.Scanner;


public class LeastCommonMultiple {
	public static Scanner scanner = new Scanner(System.in);

	public static int USCLN(int a, int b) {
        int temp1 = a;
        int temp2 = b;
        while (temp1 != temp2) {
            if (temp1 > temp2) {
                temp1 -= temp2;
            } else {
                temp2 -= temp1;
            }
        }
        int uscln = temp1;
        return uscln;
    }
	public static int BSCNN(int a, int b) {
        return (a * b) / USCLN(a, b);
    }
	public static int getLeastCommonMultiple(int []arr , int n) {
		int tmp = BSCNN(arr[0], arr[1]);
		for (int i =2 ; i<n;i++) {
			tmp = BSCNN(tmp, arr[i]);
		}
		return tmp;
	}
	
		public static void main(String[] args) {
	        System.out.print("Nhập số phần tử của mảng: ");
	        int n = scanner.nextInt();
	        int[] arr = new int[n];
	        System.out.print("Nhập các phần tử của mảng: \n");
	        for (int i = 0; i < n; i++) {
	            System.out.printf("a[%d] = ", i);
	            arr[i] = scanner.nextInt();
	        }
	        
			System.out.println("Boi chung nho nhat la:" +getLeastCommonMultiple(arr, n));
	    }
		
	
	 public static void show(int[] arr) {
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }
	
}
