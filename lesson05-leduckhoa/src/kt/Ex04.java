package kt;

import java.util.Arrays;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Mời nhập n:");
		int n = ip.nextInt();
		int[] a = new int[n];
		for(int i = 0; i<n;i++) {
			System.out.print("a["+i+"]=");
			a[i] = ip.nextInt();
		}
		int[] c = getUniqueNumbers(a, n);
		
		System.out.println("Các số xuất hiện 1 lần là: "+Arrays.toString(c));
		
		
		
	}
	private static int[] getUniqueNumbers(int[] a, int n) {
		int[] b = new int[102];
		for(int i = 0; i < n;i++) {
			b[a[i]]++;
		}
		int[] c = new int [102];
		int k=0;
		for(int i = 0; i < 102;i++) {
			if(b[i]==1) {
				c[k++]=i;
			}
		}
		return Arrays.copyOfRange(c, 0, k);
	}
}
