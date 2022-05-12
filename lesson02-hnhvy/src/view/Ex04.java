package view;

import java.util.Scanner;

/*
 *  Viết chương trình nhập vào một dãy các số nguyên từ bàn phím. Tìm số lẻ
lớn nhất trong dãy số và in ra.
 * Người tạo : hnhvy
 * Ngày tạo : 11/05/22
 * **/
//Input nhập vào 1 dãy các số nguyên  
/*
* B1 tạo biến  -> in thông báo nhập số phần tử mảng
 *B2 : Tạo mảng -> cho nhập từng phần tử trong mảng 
 *B3 : Duyệt vòng lặp cho 2 đk là số lẻ và là số lớn nhất 
 * **/
//	Output Số lẻ lớn nhất trong dãy số và in ra.
public class Ex04 {
	public static void main(String[] args) {
		run();
		}
		private static void run() {
			int n;
			int max = 0;
			Scanner input = new Scanner(System.in);
			System.out.println("The number of elements of the array: ");
			n = input.nextInt();
			int [] index = new int[n];
			for (int i = 0; i < n; i++) {
				System.out.println("Enter element array: ");
				index[i] = input.nextInt();
				if (index[i] % 2 != 0 && index[i] > max)
					max = index[i];
			}
			
			System.out.println(max + " is the largest odd number");
		}
	}