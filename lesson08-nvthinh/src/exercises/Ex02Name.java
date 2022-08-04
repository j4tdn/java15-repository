package exercises;

import java.util.Scanner;

public class Ex02Name {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten vao day: ");
		String string = sc.nextLine();
		System.out.println(photmat(string));
	}
	
	private static String photmat(String string) {
		
		String photmatnem = "";
		String[] words = string.split("\\s+ ");
		for(String word : words) {
			
			photmatnem += Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase() +" ";	
		}
		return photmatnem;
	}
}
