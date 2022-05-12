package view;

import java.util.Scanner;

/*
 *  Nhập vào số bất kỳ kiểm tra số đó có phải số đối xứng ko?
 * Người tạo : hnhvy
 * Ngày tạo : 11/05/22
 * **/
//Input nhập vào 1 số 
/*
* B1 tạo biến  -> in thông báo nhập n
 * B2 : Tìm số đảo của số nguyên vừa nhập
 * B3 : So sánh số đảo và số nguyên đó ->Là số đối xứng nếu 2 số bằng nhau và ngược lại
 * **/
//	Output In ra đối xứng không
public class Ex03 {
		private static int reverse;
		public static void main(String[] args) {
			int n;
			 Scanner input = new Scanner(System.in);
			 System.out.println("Please enter the number of n :");
			 n = input.nextInt();
			 if (isSymmetry(n)) {
					System.out.println(n + " is symmetrical number");
				} else {
					System.out.println(n + " is not symmetrical number");
				}

		}
		public static int symmetry(int n) {
			int  nRem;
			int reverse = 0;
			while (n != 0)
			{
				 nRem = n % 10;
				 reverse = (reverse * 10) + nRem;
				 n = n / 10;
			}
			return reverse;
		}
			private static boolean isSymmetry(int n) {
			if (n == symmetry(n)) {
				return true;
			} else {
				return false;
			}
		}


		

	
}
