package structure.array;

public class Ex01ArrayOperation {
	public static void main(String[] args) {
		int[] numbers = new int[6];
		numbers[3] = 25;
		
		System.out.println("==================");
		// System.out.println("Index 3: " + numbers[3]);
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Value at index " + i + ":" + numbers[i]);
		}
		for (int number : numbers) {
			System.out.println("number: " + number);
		}
		
		System.out.println("=================");
		String[] sequences = { "hello", "hi", "welcome" };
		System.out.println("leght:" + sequences.length);
		for (String sequence : sequences) {
			System.out.println(sequence);
		}

	}
}
