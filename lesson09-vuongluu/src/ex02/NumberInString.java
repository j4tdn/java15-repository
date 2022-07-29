package ex02;

public class NumberInString {
	public static void main(String[] args) {
		String[] numbers = { "123fsdffds314132" };
		getLargestNumbers(numbers);
	}

	private static void getLargestNumbers(String[] numbers) {
		for (String number : numbers) {
			if ((number.matches("[a-zA-Z]*"))) {
				System.out.println("max is 0");
			} else {
				String a = number.replaceAll("[^0-9,-\\.]", ",");
				String[] items = a.split(",");
				for (int i = 0; i < items.length; i++) {
//					int max = Integer.parseInt(items[i]);
					System.out.println(items[i]);
				}
			}
		}

	}
}
