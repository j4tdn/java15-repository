package view;

public class Ex01isPowerOf {
	public static boolean isPower(int x, int y)
    {
		int n = 1; 
		if(x > y) {
			while(n < x) {
				n *= y;
			}
		}
		if(x < y) {
			while(n < y) {
				n *= x;
			}
		}
		return ((n == x) || (n == y));
    }
	public static void main(String[] args) {
		System.out.println(isPower(4, 64));
		System.out.println(isPower(2, 6));
		System.out.println(isPower(4, 64));
		System.out.println(isPower(8, 2));
		System.out.println(isPower(6, 2));
	}
}
