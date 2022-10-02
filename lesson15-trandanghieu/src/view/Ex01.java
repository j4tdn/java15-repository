package view;

import java.util.Arrays;
import java.util.List;

public class Ex01 {
	public static void main(String[] args) {
		Integer[] numbers1 = { 1, 2, 3, 4, 5, 6, 5, 5, 3, 1 };
		List<Integer> list1s = Arrays.asList(numbers1);
		// prob1
		list1s.stream()
			.filter(e -> {
				int count = 0;
				for (Integer list : list1s) {
					if (e == list) {
						count++;
					}
				}
				return count == 1;
			})
			.distinct()
			.forEach(System.out::println);

		System.out.println("============");

		Integer[] numbers2 = { 5, 7, 9, 10, 20, 9, 7, 7, 11 };
		List<Integer> list2s = Arrays.asList(numbers2);
		list2s.stream()
				.filter(e -> {
					int count = 0;
					for (Integer list : list2s) {
						if (e == list) {
							count++;
						}
					}
					return count != 1;
				})
				.distinct()
				.forEach(System.out::println);

	}

}
