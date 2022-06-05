package Bai1;
// Làm đề 4 câu ạ

public class PowerOf {
	public static void main(String[] args) {
		// sửa đầu vào tại đây
		double a=2, b=8, temp=0;
		if (a < b ) {
			temp= a ;
			a = b;
			b = temp;
		}
		isPowerOf(a, b);
		
}
	public static boolean isPowerOf(double a, double b) {
		boolean check = true;
		 
		
		for (int i = 0; i < a ; i++ ) {
			double c = Math.pow(b, i);
			if (a == c) {
				check = true;
				break;
			}
			if (a < c) {
				check = false;
				break;
			}
		}
		if(check == true) {
			System.out.println("yes");
		}
		else {
			System.out.println("No");
		}
		return true;
}
}