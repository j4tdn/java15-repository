package baitap;

import java.util.Scanner;

public class TinhGiaiThua {

	  
    public static long tinhGiaiThua(int n) {
        long gt = 1;
		Scanner ip = new Scanner(System.in);
		System.out.println("nhap n: ");
		n = ip.nextInt();
        for (int i = 1; i <= n; i++) {
            gt *= i;
        }
        return gt;
    }

    public static void main(String[] args) {
        long S = 0;
        for (int i = 1; i <= 44
        		; i++) {
            S += tinhGiaiThua(i);
        }
        System.out.println("Tong cac giai thua la: " + S);
    }

}
