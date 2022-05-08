package io;
import java.util.Scanner;
public class Ex01Scanner {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner("34\nHien");
		int name = sc.nextInt();
		System.out.println("Your name: " + name);
		String hobbies = sc.nextLine();
		System.out.println("Your hobbies: "+hobbies);
		
	}
}
