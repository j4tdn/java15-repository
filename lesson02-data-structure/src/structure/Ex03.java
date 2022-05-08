package structure;

public class Ex03 {

	public static void main(String[] args) {
		int number = 18;
		int updated = updated(number);
		System.out.println("number: " + number);//18
		
		//modified(number)
		System.out.println("updated: " + updated);//99
		
	}
	
		// TODO Auto-generated method stub

	
	public static void modified(int input) {
		input =99;
		
	}
	public static int updated(int input) {
		input = 99;
		return input;
}
}
