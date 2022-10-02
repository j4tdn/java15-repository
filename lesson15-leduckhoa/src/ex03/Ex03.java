package ex03;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Mời nhập n:");
		int n = ip.nextInt();
		Handle(n);
	}
	
	public static void Handle(int n) {
		int sum = 0;
		while(true) {
			while(n>0)
			{
				sum += (n%10) * (n%10);
				n/=10;	
			}
			n=sum;
			sum=0;
			if(n<=9) break;
		}
		if(n == 1) System.out.println("là số hạnh phúc");
		else {
			System.out.println("không phải số hạnh phúc");
		}
	}
}
