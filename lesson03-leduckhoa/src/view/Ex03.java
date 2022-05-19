package view;

import java.util.Random;
import java.util.Scanner;

public class Ex03 {
	public static boolean check(int a[], int n, int max){  
		int max1=0;
		for(int i = 0; i<n; i++){
			if(a[i]>max1) max1=a[i];
		}
		return (max == max1)?true:false;
	}

	public static void input(int a[][],int m,int n){
		Random rd = new Random();
		
		for(int i = 0; i<m; i++){
			for(int j = 0; j<n; j++){
					a[i][j] = 1 + rd.nextInt(99);
			}
		}
	}

	public static void treatment(int a[][], int m, int n){
		int k = 0,count=0;
		for(int i = 0; i<m; i++){
			int min = 100;
			for(int j = 0; j<n; j++){
					if(a[i][j] < min){
						min = a[i][j];
						k=j;
					} 
			}
			
			int[] b = new int[n];
			for(int h=0;h<n;h++){
				b[h]= a[h][k];
			}
			if( check(b, n, min) == true){
				System.out.println("có phần tử yên ngựa! " + min + " ");
				count++;
			} 
			
		}
		if(count ==0 ) System.out.println("không có phần tử yên ngựa");;
	}
	public static void display(int a[][], int m, int n) {
		System.out.println("==================================;");
		for(int i = 0; i<m; i++){
			for(int j = 0; j<n; j++){
					System.out.print(a[i][j] + " ");
			}
			System.out.print("\n");
		}
		System.out.println("==================================;");
	}

	public static void main(String[] args) {
		
			Scanner ip = new Scanner(System.in);
			int[][] a = new int[20][20];
			System.out.println("Mời bạn nhập M và N:");
			int m=ip.nextInt(),n=ip.nextInt();
			
			input(a, m, n);
			display(a, m, n);
			treatment(a, m, n);
			
		}
}
