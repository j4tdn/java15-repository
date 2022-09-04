package Ex04;

import java.util.Scanner;

public class Test {
	private static Scanner sc =  new Scanner(System.in);
	public static void main(String[] args) {
		
		Dictionary dictionary = new Dictionary();
		int choose;
		
		do {
			System.out.println("1.add word");
			System.out.println("2.Look UP");
			choose = Integer.parseInt(sc.nextLine());
			switch (choose) {
			case 1: {
				System.out.println("enter word");
				
				String ip = sc.nextLine();
				Word word = new Word(ip);
				System.out.println("enter meaning");
				String meaning = sc.nextLine();
				System.out.println("enter word classes");
				String type = sc.nextLine();
				System.out.println("enter the note");
				String note = sc.nextLine();
				dictionary.addWord(word, new Means(meaning, type, note));
				break;
			}
			case 2:{
				System.out.println("enter word want to loop up");
				String ip = sc.nextLine();
				Word word = new Word(ip);
				System.out.println(dictionary.loopUp(word));
				break;
			}
			default:
				System.out.println("please enter again");
			}
			
		} while(choose != 3);
	}
}
