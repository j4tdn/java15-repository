package ex06;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		String s = "";
		
		System.out.print("Enter size: ");
		int size = sc.nextInt();
		while (i <= size) {
			s +=  i++;
		}
		System.out.println(s);
		System.out.print("Enter index: ");
		int index = sc.nextInt();
		System.out.println("Result: " + s.charAt(index));
		sc.close();
	}
}