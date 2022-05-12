package view;

public class Ex06PrimeNumber {
	public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


	public static void main(String[] args) {
		int number = 1000, dem = 0;
		for (int i = 0; i < number; i++) {
			if (isPrimeNumber(i) == true) {
				dem++;
				if(dem == 200 ) {
					System.out.println(i);
				}
			}
			
		}
		

	}
}