package structure;

public class Ex03 {

	public static void main(String[] args) {
		int number = 18 ;
		//modified(number);
		int update = update(number);
		System.out.println("number: "+ number);
		System.out.println("update: "+ update);
	}
	public static void modified(int input) {
		input = 99;
	}
	public static int update(int input ) {
		input = 99;
		return input;
	}
}
