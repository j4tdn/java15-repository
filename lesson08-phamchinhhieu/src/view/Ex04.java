package view;

import java.util.Arrays;

/**
 * 
 * Số nguyên tố tương đương Hai số tự nhiên được gọi là nguyên tố tương đương
 * nếu chúng có chung các ước số nguyên tố. Ví dụ: Các số 75 và 15 là nguyên tố
 * tương đương vì cùng có các ước nguyên tố là 3 và 5. Yêu cầu: Cho trước hai số
 * tự nhiên N, M. Hãy viết chương trình kiểm tra xem các số này có là nguyên tố
 * tương đương với nhau hay không? Input: N,M ( 2 ≤ M ≤ N ≤ 300000000000000000).
 * Output: Nếu chúng là nguyên tố tương đương ghi YES, ngược lại: ghi NO.
 *
 */
//IDEAL: Tìm ra mảng các thừa số nguyên tố(khác nhau) của các số
//		So sánh các giá trị giữa 2 mãng
//		+ Nếu tổng các phần tử bằng nhau giữa 2 mảng = độ dài của 1 trong 2 mảng đó đúng.
public class Ex04 {
	public static void main(String[] args) {
		int a = 15;
		int b = 75;
		int[] a1 = FindPrimeFactors(a);
		for (int i : a1) {
			System.out.print(i + " ");
		}
		System.out.println();
		int[] b1 = FindPrimeFactors(b);
		for (int i : b1) {
			System.out.print(i + " ");
		}
		System.out.println();
		if(EquivalentPrime(a1, b1)) {
			System.out.println("YES");
		}
		else
			System.out.println("NO");
		
	}
	private static int[] FindPrimeFactors(int n) {
		int[] number = new int[10];
		int count = 0;
		int count1 = 0;
		int i = 2;
		while(n > 1){
			if(n % i == 0) {
				n = n / i;
				for(int j = 0; j < number.length;j++) {
					if(i == number[j]) {
						count1++;
					}
				}
				if(count1 == 0)
				{
					number[count] = i;
					count++;
				}
				
			}
			else {
				i++;
			}
		}
		return Arrays.copyOfRange(number, 0, count);
	}
	private static boolean EquivalentPrime(int[] aa, int[] bb) {
		int[] c = aa.length > bb.length ? aa : bb;
		int[] d = aa.length < bb.length ? aa : bb;
		if(c.length != d.length) {
			return false;
		}
		int count = 0;
		for(int i = 0; i < c.length; i++) { 
			for(int j = 0; j < d.length; j++) { 
				if(d[j] == c[i]) {
					count++;
				}
			}
		}
		if(count != c.length) {
			return false;
		}
		else		
		return true;	
	}
}
