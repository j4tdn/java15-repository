package exercies;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Ex01 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 5, 5, 3, 1);

//		Liệt kê các phần tử chỉ xuất hiện một lần
		List<Integer> uniqueNumbers = list.stream().filter(i -> Collections.frequency(list, i) == 1)
				.collect(Collectors.toList());
		uniqueNumbers.forEach(i -> System.out.print(i + " "));
		System.out.println();
//		Liệt kê các phần tử xuất nhiều hơn một lần
		Set<Integer> dupNumbers = list.stream().filter(i -> Collections.frequency(list, i) > 1)
				.collect(Collectors.toSet());
		dupNumbers.forEach(i -> System.out.print(i + " "));
	}
}