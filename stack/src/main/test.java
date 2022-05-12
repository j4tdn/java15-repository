package main;

import java.util.Scanner;
import java.util.Stack;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Stack<String> stackText = new Stack<String>();
		
		System.out.println("NHập cái gì đó đi");
		String text = sc.nextLine();
		for (int i = 0; i < text.length(); i++) {
			stackText.push(text.charAt(i)+"");
			
		}
		System.out.println("CHuỗi NGược");
		for (int i = 0; i < text.length(); i++) {
			System.out.print(stackText.pop());
			
		}
		System.out.println(stackText.size());
		System.out.println(stackText.contains("u"));
//		Stack<String> stackSoDu = new Stack<String>();
//		System.out.println("Nhập 1 số nguyên dương từ bàn phím");
//		int x = sc.nextInt();
//		while(x>0) {
//			int soDu = x%2;
//			System.out.print(soDu);
//			stackSoDu.push(soDu+"");
//			x = x/2;
//		}
//		System.out.println("Số nhị phân là:");
//		int n = stackSoDu.size();
//		for(int i=0; i<n; i++) {
//			System.out.print(stackSoDu.pop());
//		}
	}

}
