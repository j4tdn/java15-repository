package view;

import java.util.Arrays;
import java.util.Scanner;

public class Ex05Change10to2 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Moi nhap so thap phan can chuyen doi:");
		int a = ip.nextInt();
		int[] b = Change(a);
		System.out.println("Ma nhi phan cua " +  a  + " la: " + Arrays.toString(b));
	}
	
	private static int[] Change(int a) {
		
		int []x = new int[32];
		int count = 0;
		for(int i = 0; a > 0 ; i++) {
			x[i] = a%2;
			a/=2;
			count++;
		}
		
		int[] b = new int[count];
		for(int i=0; i < count; i++) {
			b[i] = x[count-1-i];
		}
		return Arrays.copyOfRange(b, 0, count);
	}
}
