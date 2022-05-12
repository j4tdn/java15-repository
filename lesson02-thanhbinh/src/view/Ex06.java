package view;

public class Ex06 {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 1 ; ; i++ ) {
            if(isCheck(i)) count ++;
            if(count == 200 ) {
                System.out.println(i);
                break;
            }
        }

    }
    private static boolean isCheck(long n) {
        if (n < 2) return false;
        for(int i = 2; i <= (long) Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
}
