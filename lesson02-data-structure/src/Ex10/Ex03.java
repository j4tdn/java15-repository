package Ex10;

public class Ex03 {
public static void main(String[] args) {
	int number = 18;
	
	int updated = update(number);
	
	System.out.println("number: " + number);
	System.out.println("updated: " + updated);
	
}

public static int sum(int a, int b) {
	return a + b;
}

public static void modified(int input) {
	input = 99;
}
public static int update(int input) {
	input = 99;
	return input;
}
}

