package exercise;

import java.util.Scanner;

public class Ex04Max {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		int []x = new int[5];
		
		System.out.println("Moi nhap:");
		for(int i=0; i<4;i++) x[i] = ip.nextInt();
		System.out.println(Search(x));
	}
	private static int Search(int[] x) {
		int max = x[0];
		for(int i = 1; i < x.length; i++) if(x[i] % 2 != 0) if(x[i] > max) max = x[i];
		return max;
	}
	
}
