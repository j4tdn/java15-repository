public class Ex01 {
    public static void main(String[] args) {

        System.out.println("(8,2)" + isPowerOf(8,2));

    }

    private static boolean isPowerOf(int a, int b){
        double log = a > b ? Math.log(a) / Math.log(b) : Math.log(b) / Math.log(a);
        return Math.ceil(log) == (double)Math.round(log);
    }
}
