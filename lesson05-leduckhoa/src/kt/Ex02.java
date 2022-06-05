package kt;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		int []a = new int[50];
		Scanner ip = new Scanner(System.in);
		System.out.println("Mời bạn nhập n:");
		int n = ip.nextInt();
		for(int i = 0; i< n-1;i++) {
			System.out.print("a["+i+"]=");
			a[i] = ip.nextInt();
		}

		System.out.println("Số còn thiếu: "+getMissingNumber(a, n));
	}
	
	private static int getMissingNumber(int[] a, int n) {
		for( int i = 0; i < n - 2; i++) {
			for(int j = i + 1; j < n-1;j++) {
				if(a[i]>a[j]) {
					int t = a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		for(int i = 1; i < n-1; i++) {
			if(a[i]-a[i-1]!=1) return a[i]-1;
		}
		return a[n-2]+1;
	}
}
