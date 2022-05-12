package view;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so bat ki : ");
        int n = scanner.nextInt();

        int check = symmetrical_num(n);

        if (check == 1) System.out.println(n + " la so doi xung");
        else System.out.println(n + " khong phai la so doi xung");
    }

    private static int reverse_num(int n) {
        int reverse = 0;
        while (n > 0) {
            reverse = reverse * 10 + n % 10;
            n /= 10;
        }
        return reverse;
    }

    private static int symmetrical_num(int n) {
        int flag = 0;
        if (reverse_num(n) == n) flag = 1;
        return flag;
    }
}
