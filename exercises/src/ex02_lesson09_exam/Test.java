package ex02_lesson09_exam;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
	static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Mời nhập số lượng chuỗi:");
		int n = ip.nextInt();ip.nextLine();
		String[] string = new String[n];
		Input(string);
		Treament(string);
		
		
	}
	private static void Input(String[] string) {
		for(int i =0;i<string.length;i++) string[i] = ip.nextLine();
	}
	
	private static int Change(char[] string1, int firstpos,int lastpos) {
		
		int value = 0;
		for(int i = firstpos;i<=lastpos;i++) {
			value = value*10 + string1[i]-'0';
		}
		return value;
	}
	
	private static int Findmax(String s) {
		char[] s1 = s.toCharArray();
		int pos = -1, max = Integer.MIN_VALUE,count = 0;
		for(int i = 0;i<s.length();i++) {
			if(s1[i]>= '0' && s1[i] <= '9') {
				count++;
				for(int j = i+1;j<s1.length;j++) {
					if((s1[j] < '0' || s1[j] > '9')) {
						int temp = Change(s1, i,j-1);
						if(temp > max) max = temp;
						i=j-1;
						break;
					}
					if(j==s1.length && s1[j] >=0 && s1[j]<=9) {
							int temp = Change(s1, i,j-1);
							if(temp > max) max = temp;
							break;
						
				}	
			}
			
		}
		
		}
		
		//if(count ==0) return 0;
		return max;
	}
	
	private static void Treament(String[] string) {
		int[] a = new int[string.length];
		int count =0;
		for(int i = 0;i<string.length;i++) {
			int n= Findmax(string[i]);
			if(n!=0) a[count++] = n;
		}
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}
	
	
	
}