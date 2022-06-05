package view;

import java.util.Scanner;

public class Ex03getMaxValidNumber {
	public static int ScanArrayNumFromString(String string) {

		string = string.replaceAll("[^0-9,-\\.]", ",");

		String[] item = string.split(",");

		for (int i = 0; i < item.length; i++) {
			try {
				Double.parseDouble(item[i]);
				System.out.println(item[i]);
			} catch (NumberFormatException e) {
			}
		}
		int getMaxValidNumber(String string) {
			int max = 0;
			for(int i = 0; i < item.length; i++) {
				if(max > Integer.valueOf(item[i])) {
					max = Integer.valueOf(item[i]);
				}
			}
			return max;
		}
		
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 String str = sc.nextLine(); 
		 getMaxValidNumber(str);
		 
		 
	}
}