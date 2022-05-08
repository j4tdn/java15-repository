package homework;

public class bai1 {

	public static void main(String[] args) {
		
	}
	public boolean isPowerOfTwo(int n){
		if( 0 == n|| 1 == n ) return true;
		int x = n / 2;
		int y = n%2;
		if (1 == y) return false;
		return isPowerOfTwo(x);
	}

}
