package ex01;


import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Mời nhập n: " ); int n =ip.nextInt();
		for(int i =1,j=n ; i<=n/2;i++,j--) {
			int a = 1, b = j;
			while(a<=i) System.out.print(a++ + " ");
			for(int k = 1; k <=b-a;k++) System.out.print("  ");
			while(b<=n) System.out.print(b++ + " ");
			System.out.print("\n");
		}
		for(int i =1; i<=n;i++) System.out.print(i + " ");
		System.out.print("\n");
		float k = (float) (n*1.0/2);
		int h = (int) Math.ceil(k);
		
		for(int i =n/2,j=h+1 ; i>=1;i--,j++) {
			int a = 1, b = j;
			while(a<=i) System.out.print(a++ + " ");
			for(int d = 1; d <=b-a;d++) System.out.print("  ");
			while(b<=n) System.out.print(b++ + " ");
			System.out.print("\n");
		}
		
	}
}
