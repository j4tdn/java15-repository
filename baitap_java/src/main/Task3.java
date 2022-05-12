package main;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		double a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập a, b,c ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		if (Math.pow(a, 2)== Math.pow(b, 2) + Math.pow(c, 2) 
		|| Math.pow(b, 2)==Math.pow(a, 2) + Math.pow(c, 2)
		|| Math.pow(c, 2)== Math.pow(a, 2) + Math.pow(b, 2)){
			System.out.println("a, b c là ba cạnh của tam giác vuông");
		}else {
			System.out.println("a, b, c không phải là ba cạnh của tam giác vuông");
		}
	}

}
