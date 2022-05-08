package structure.array;

import java.util.Iterator;

public class Ex01 {

	public static void main(String[] args) {
		int[] numbers = new int[6];
		numbers[3] = 25;
		// System.out.println("Index 3: " + numbers[3]);
		// for =index duyệt theo thứ tự của index (từ a[0] -> a[n])
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Value at index " + i + ": " + numbers[i]);
		}
		System.out.println("=======");

		// foreach duyeetj theo phaafn tuwr trong mangr
		// number : numbers : gán từng giá trị của numbers cho number
		for (int number : numbers) {
			System.out.println("number: " + number);
		}
		System.out.println("============");
		String[] sequences = { "chao", "em" };
		System.out.println("length: " + sequences.length);
		for (String sequence : sequences) {
			System.out.println(sequence);
		}

	}

}
