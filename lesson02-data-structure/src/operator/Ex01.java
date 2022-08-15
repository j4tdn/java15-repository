package operator;

public class Ex01 {
	public static void main(String[] args) {
		// = == ++ -- && || !
		int a = 5;
		int b = 2;
		int c = 4;
		
		// VD01
		System.out.println("Line 10: " + (a++)); // Line 10: 5
		System.out.println("Line 11: " + (++a)); // Line 11: 7
		
		b = b + b++ - --b - ++b + c++ + c;
		
		System.out.println("b: " + b);
		System.out.println("c: " + c);
	}
}
