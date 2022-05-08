package operator;

public class Ex01 {
	public static void main(String[] args) {
		// = == ++ -- && || !
		int a = 5;
		int b = 2;
		int c = 4;
		
		//vd1: b - a++ // b - ++a
		System.out.println("Line 10: " + (a++));
		System.out.println("Line 11: " + (++a));
		
		//b += b++ - --b - ++b + c++ + c
		System.out.println("b: " + b);
		System.out.println("c: " + c);
	}
}
