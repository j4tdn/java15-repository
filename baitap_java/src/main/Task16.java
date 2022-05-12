package main;

import java.util.Scanner;

public class Task16 {
public static void main(String[] args) {
	char letter;
	Scanner sc = new Scanner(System.in);
	do {
		System.out.println("----------------------");
	System.out.println("Nhập ký tự muốn kiểm tra");
	letter = sc.nextLine().charAt(0);
	switch (letter) {
	case 'e':
		System.out.println(letter+ " là nguyên âm");
		break;
	case 'u':
		System.out.println(letter+ " là nguyên âm");
		break;
	case 'o':
		System.out.println(letter+ " là nguyên âm");
		break;
	case 'a':
		System.out.println(letter+ " là nguyên âm");
		break;
	case 'i':
		System.out.println(letter+ " là nguyên âm");
		break;
	case 'E':
		System.out.println(letter+ " là nguyên âm");
		break;
	case 'U':
		System.out.println(letter+ " là nguyên âm");
		break;
	case 'O':
		System.out.println(letter+ " là nguyên âm");
		break;
	case 'A':
		System.out.println(letter+ " là nguyên âm");
		break;
	case 'I':
		System.out.println(letter+ " là nguyên âm");
		break;
	
		
	default:
		System.out.println(letter+ " là phụ âm");
		break;
	}
	
	}while (letter != 0);
}
}
