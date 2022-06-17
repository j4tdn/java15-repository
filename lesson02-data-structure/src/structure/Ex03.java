package structure;

public class Ex03 {
	public static void main(String[] args) {
		int number = 18;
	//	modified(20);
		update(number);
		
		System.out.println("number: "+ number);
	}
	public static void modified(int input) {
		input = 99;
		
	}
	public static int update(int input) {
		input = 99;
		return input;
	}
}
