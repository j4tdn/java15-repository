package structure;

public class Ex03 {
	public static void main(String[] args) {
		int number = 18;
		// modified (number)
		int updated = update(number);
		System.out.println("Number" + number);
		System.out.println("Updated" + updated);

	}
	//AcessModifier [Static] return_type method_name(List of parameters){
	//body
	//}
	
	//pass by value 
	// int input = number
	public static void modified (int input) {
		//local variable
		input = 99;
	}
	public static int update (int input) {
		input = 99;
		return input;
	}
}
