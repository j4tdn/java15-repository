package view;

public class Ex06 {
	public static void main(String[] args) {
		int count=0;
		System.out.println("so nguyen to thu 200 la: ");
        for (int i = 0; ; i++) {
            if (isPrimeNumber(i)) {
                count++;
                if(count==200) {
                	System.out.println(i);
                	break;
                }
            }
        }
	}
	public static boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
	 
}
