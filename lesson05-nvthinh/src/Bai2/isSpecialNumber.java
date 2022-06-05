package Bai2;



public class isSpecialNumber {

	public static void main(String[] args) {
		int a = 10;
		
		isSpecialNumber1(a);
	}
	public static boolean isSpecialNumber1(int a) {
		int c = 0;
		boolean check = true;
		for (int i = 0; i < a ; i++) {
			c = i+i;
			if ( a==c) {
				check = true;
				break;
			}
			if (a < c) {
				check = false;
				break;
			}
		}
		if (check == true) {
			System.out.println("yes");
		}
		if (check == false) {
			System.out.println("No");
		}
		return true;
	}

}
