package view;

import java.util.Scanner;


public class Ex01 {
	public static void main(String[] args) {
		String ip="Bach     Khoa      DUT";
		showCharacter(ip);
		System.out.println(" \n============");
		showWord(ip);
		System.out.println("===========");
		showReverseCharacter(ip);
		System.out.println("\n===========");
		showReverseCharacter(ip);
	}
	private static void showCharacter(String text) {
		
		String[] words= text.split("\\s+");
		for(String word:words) {
			for(int i=0; i<word.length(); i++) {
				char c=word.charAt(i);
				System.out.print(Character.toString(c)+" ");
			}
		}
		
	}
	private static void showWord(String text) {
		String[] words= text.split("\\s+");
		for(String word:words) {
			System.out.println(word+" ");
		}
	}
	private static void showReverseCharacter(String text) {
		StringBuilder str= new StringBuilder(text).reverse();
		
		
		
		String[] words= str.toString().split("\\s+");
		for(String word:words) {
			for(int i=0; i<word.length(); i++) {
				char c=word.charAt(i);
				System.out.print(Character.toString(c)+" ");
			}
		}
	}
	private static void showReverseWord(String text) {
		StringBuilder str= new StringBuilder(text).reverse();
		String[] words= str.toString().split("\\s+");
		for(String word:words) {
			System.out.println(word+" ");
		}
	}
}	
	

