package view;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("Input: ");
		String s = sc.nextLine();
		*/
        String s = "aaabaaabbaaaaa";
        int current = 0;
        int count = 1;
        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                if (count > max) {
                    max = count;
                    maxIndex = current;
                }
                current = i + 1;
                count = 1;
            } else {
                ++count;
            }
        }
        	
        if (count > max) {
        	max = count;
            maxIndex = current;
        }
        for (int i = maxIndex; i < maxIndex + max; i++) {
            System.out.print(s.charAt(i));
        }
        System.out.println("");
    }
}
