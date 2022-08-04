package Exx02;

import java.util.Scanner;

public class Output {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String s1 = " ";
		String [] arr = s.split(" ");
		for(int i =0 ; i< arr.length; i++) {
			String name = arr[i] + " " ;
			 String firstLetter = name.substring(0, 1);
			    String remainingLetters = name.substring(1, name.length());
			    firstLetter = firstLetter.toUpperCase();

			    name = firstLetter + remainingLetters;
			     s1 += name;
		}
		System.out.println(s1);
		
	
	}

}
