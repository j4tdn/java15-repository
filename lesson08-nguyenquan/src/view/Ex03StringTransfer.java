package view;

import java.text.Normalizer;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex03StringTransfer {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the string:");
		String string = scanner.nextLine();
		String result = Transfer(string);
		System.out.println("==========================");
		System.out.println(result);
	}

	private static String Transfer(String string) {
		 try {
	            String temp = Normalizer.normalize(string, Normalizer.Form.NFD);
	            Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
	            return pattern.matcher(temp).replaceAll("");
	     } catch (Exception ex) {
	            ex.printStackTrace();
	      }
		 return null;
	}
}