package view;

public class Ex01Power {
    public static void main(String[] args) {
        int[] elements = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 32};
        for (int number : elements) {
            boolean isPower = isPowerofTwo(number);
            System.out.println("==>" + isPower);
        }

        System.out.println("===========================================");

        System.out.println("8-2" + isPower2(8, 2));
        System.out.println("8-3" + isPower2(8, 3));
        System.out.println("7-2" + isPower2(7, 2));
        System.out.println("5-2" + isPower2(5, 2));
    }

    private static boolean isPowerofTwo(int number) {
        double log = Math.log(number) / Math.log(2);
        System.out.println(number + "==>" + log);
        return Math.ceil(log) == Math.round(log);
    }

    private static boolean isPower2(int a, int b) {
        double log = a > b ? Math.log(a) / Math.log(b) : Math.log(b) / Math.log(a);
        return Math.ceil(log) == Math.round(log);
    }
}
