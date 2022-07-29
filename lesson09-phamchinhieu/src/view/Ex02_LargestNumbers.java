package view;

import java.util.Arrays;

public class Ex02_LargestNumbers {
	public static void main(String[] args) {
		String s[] = {"aa6b546c6e22h", "aa6b326c6e22h", "sfdfghg3453sdf3223", "sdfghh"};
		int[] aa = getLargestNumbers(s);
		sortASC(aa);
		for(int i = 0; i < aa.length; i++) {
			System.out.println(aa[i]);
		}
	}
	private static int[] getLargestNumbers(String s[]) {
		int[] names = new int[s.length];
		int count = 0;
		int number = 0;
		int max = 0;
		String number1 = "";
		for(int i = 0; i < s.length; i++) {
			for(int j = 0; j < s[i].length(); j++)
			if(s[i].charAt(j) >= '0' && s[i].charAt(j) <= '9') {
				number1 += s[i].charAt(j); 
				number = Integer.parseInt(number1);
			}
			else {
				if(number > max) {
					max = number;
				}
				number1 = "";
			}
			names[count] = max;
			count++;
			max = 0; number = 0;
			number1 = "";
		}
		return names;
		
	}
	public static int[] sortASC(int [] arr) {
        int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
		return arr;
    }
}
