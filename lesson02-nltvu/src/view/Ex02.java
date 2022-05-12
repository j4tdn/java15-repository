package view;

public class Ex02 {
	public static void main(String[] args) {
		int a = 4;
		int b = 7;
		int c = 12;
		int d = 18;
//		System.out.println("Giai thua cua " + a + " la " + Ex02.tinhGiaithua(a));
//		System.out.println("Giai thua cua " + b + " la " + Ex02.tinhGiaithua(b));
//		System.out.println("Giai thua cua " + c + " la " + Ex02.tinhGiaithua(c));
//		System.out.println("Giai thua cua " + d + " la " + Ex02.tinhGiaithua(d));
		System.out.print ("tong S = " + ( tinhGiaithua(a) + tinhGiaithua(b) + tinhGiaithua(c) + tinhGiaithua(d)));
	}
	
	
	
	public static long tinhGiaithua(int n) {
		long giai_thua = 1;
		if (n == 0 || n == 1) {
			return giai_thua;
		
		} else {
			for (int i=2; i <= n; i++) {
				giai_thua *= i;
				
			}
		}
		return giai_thua;
	}


//    static int factorial(int n) {
//        if (n == 1)
//            return 1;
//        else
//            return (n * factorial(n - 1));
//    }
// 
//    public static void main(String[] args) {
//        System.out.println("Giai thừa của 4 là: " + factorial(4));
//        System.out.println("Giai thừa của 7 là: " + factorial(7));
//        System.out.println("Giai thừa của 12 là: " + factorial(12));
//        System.out.println("Giai thừa của 18 là: " + factorial( 18))
//        
//    }
}

