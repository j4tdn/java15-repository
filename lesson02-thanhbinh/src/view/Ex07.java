package view;

import java.util.Random;

public class Ex07 {
    public static void main(String[] args) {
        Random rd = new Random();
        int i = 0;
        int n;
        int[] a = new int[100];
        while (i < 5) {
            n = 20 + rd.nextInt(11);
            if (isCheck(n, a)) {
                a[i] = n;
                i++;
                System.out.println(n);
            }
        }
    }

    private static boolean isCheck(int n, int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (n == a[i]) return false;
        }
        return true;
    }
}
