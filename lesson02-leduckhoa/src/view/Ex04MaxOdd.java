package view;

import java.util.Scanner;

public class Ex04MaxOdd {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Moi nhap so luong so:");
		int a = ip.nextInt();
		int []x = new int[a];
		
		System.out.println("Moi nhap:");
		for(int i=0; i<x.length;i++) x[i] = ip.nextInt();
		System.out.println("So le lon nhat la : " + Search(x));
	}
	private static int Search(int[] x) {
		int max = x[0];
		for(int i = 1; i < x.length; i++) if(x[i] % 2 != 0) if(x[i] > max) max = x[i];
		return max;
	}
}
