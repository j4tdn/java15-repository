package structure.array;

public class Ex1ArrayOperation {
	public static void main(String[] args) {
		int[] numbers = new int[6];
		numbers[3]= 25;
		for(int number : numbers) {
			System.out.println("Idex i ="+ number);
		}
		
		String[] squences = {"hello", "hi", "du trau", "du bo"};
		
		for(String i : squences) {
			System.out.println(i);
		}
	}
}
