package Homework_Lesson2;

public class Ex02 {


	public static void main(String[] args) {
		long S;
		System.out.println("S = 4! + 7! + 12! + 18!");
		S = factorial(4) + factorial(7) + factorial(12) + factorial(18);
		System.out.println("S = " + S);

	}

	private static long factorial(int number){
		long factorial = 1;
		for(int i = 1; i <= number; i++) {
			factorial = factorial * i; 
		}
		return factorial;
	}
}
