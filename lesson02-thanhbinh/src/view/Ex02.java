package view;

public class Ex02 {
    public static void main(String[] args) {
        int[] so = {4, 7, 12, 18};
        System.out.println("tổng giai thừa là : " + sum(so));
    }

    private static double giaiThua(int n) {
        double result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    private static double sum(int[] a) {
        double kq = 0;
        for (int element : a) {
            kq += giaiThua(element);
        }
        return kq;
    }
}
