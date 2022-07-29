package Ex02;

public class GetLargestNumber {
	public static void main(String[] args) {
		String n = "0984abc929567b";
		System.out.println(getLargestNumbers(n));
	}

	
	private static int getLargestNumbers(String n) {
		
		String[] stringNumber = n.split("[a-z]+");
		int[] numbers = new int[stringNumber.length];

		for (int i = 0; i < stringNumber.length; i++) {
			numbers[i] = Integer.parseInt(stringNumber[i]);
		}

		int max = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			max = (max > numbers[i]) ? max : numbers[i];
		}

		return max;

	}
}
