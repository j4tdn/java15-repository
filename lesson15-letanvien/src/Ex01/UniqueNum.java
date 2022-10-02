package Ex01;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UniqueNum {

	public static void main(String[] args) {
		int[] numbers = { 123, 4312, 123, 567, 123 };

		Map<Integer, Long> numbersStatistic = Arrays.stream(numbers).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println("unique numbers : ");
		numbersStatistic.forEach((number, count) -> {
			if (count == 1)
				System.out.print(number + " ");
		});

		System.out.println("\n===========");

		System.out.println("numbers appear more than 1 time");
		numbersStatistic.forEach((number, count) -> {
			if (count > 1)
				System.out.print(number + " ");
		});
	}
}