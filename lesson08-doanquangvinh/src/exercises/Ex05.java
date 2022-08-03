package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
         Scanner ip = new Scanner(System.in);
         String s1 = "";
         String s2 = "";
         boolean flag = true;
         int longestSubString = Integer.MIN_VALUE;
         int count = 0;
         while (flag) {
        	 System.out.print("Enter value of s1 : ");
        	 s1= ip.nextLine();
        	 System.out.print("Enter value of s2 :");
        	 s2 = ip.nextLine();
			if (s1.matches("[A-Z]{1,250}") && s2.matches("[A-Z]{1,250}")) {
				ArrayList<String> listSubString = new ArrayList<String>();
				for (int index = 1; index <= s1.length(); index++) {
					for (int i = 0; i < s1.length(); i++) {
						if ((i+index)> s1.length()) 
							continue;
						listSubString.add(s1.substring(i, index+i));
					}
				}
				for (int i = listSubString.size()-1; i >= 0; i--) {
					if (s2.contains(listSubString.get(i)) && listSubString.get(i).length() > 1) {
						System.out.println(listSubString.get(i));
						break;
					}
				}
				flag = false;
			}
			System.out.println("Please Try Again");
		}
        		
	}
}
