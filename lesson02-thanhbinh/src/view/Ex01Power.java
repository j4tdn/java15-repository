package view;

public class Ex01Power {
    public static void main(String[] args) {
        int a = 35;
        if (isPower(a)) {
            System.out.println("la luy thua 2");
        } else {
            System.out.println("khong la luy thua2");
        }
    }

    private static boolean isPower(int n) {
        double log = Math.log(n) / Math.log(2);
        return Math.ceil(log) == Math.round(log);
    }
}

