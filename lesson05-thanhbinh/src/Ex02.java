public class Ex02 {
    public static void main(String[] args) {
        int n = 5;

        isSpecialNumber(5);
    }

    private static void isSpecialNumber(int s){
        int count = 0;
        int [] sum;
        for (int i = 1; i <= s;i++){
            count = count+=i;
            System.out.println(count);

        }
    }
}
