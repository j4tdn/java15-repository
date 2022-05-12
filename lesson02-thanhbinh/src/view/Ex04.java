package view;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so phan tu mang");
        n = sc.nextInt();

        int array[] = new int[n];
        int maxOdd = array[0];

        for (int i = 0; i < n; i++) {
            System.out.print("phan tu thu " + i + ": ");
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 != 0 && array[i] > maxOdd) {
                maxOdd = array[i];
            }
        }
        System.out.println(maxOdd + "la so le lon nhat");
    }
}
