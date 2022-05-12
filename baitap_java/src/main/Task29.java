package main;

import java.util.Scanner;

public class Task29 {
public static void main(String[] args) {
	int reversed = 0;
	int num;
	Scanner sc = new Scanner(System.in);
	System.out.print("NHập số muốn đảo ngược: ");
	num = sc.nextInt();
	System.out.println("dãy số trước khi đảo "+num);
	while (num != 0) {
		int digit = num % 10;
		reversed = reversed * 10 + digit;
		num = num / 10;
	}
	System.out.println("dãy số sau khi đảo ngược "+reversed);
}
}
