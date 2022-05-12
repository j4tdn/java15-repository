package array;

import java.util.Scanner;

public class TextNumber {
	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số a bất kì: ");
		a = sc.nextInt();
		do {
		if (a>0) {
			System.out.println("a là số nguyên âm");
			break;
			
		}else if(a==0) {
			System.out.println("a là số 0");
		}else {
			System.out.println("a là số nguyên dương");
			break;
		}
		}while (a!= 0);
	}

}
