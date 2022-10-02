package Ex01;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Cho dãy N (0 <= N < 100) phần tử. Mỗi phần tử N[i] (1 <= N[i] <= 20) là
một số nguyên. Yêu cầu: Mỗi câu không được quá 10 dòng code
 Liệt kê các phần tử chỉ xuất hiện một lần duy nhất trong dãy N
Ví dụ: input: 1 2 3 4 5 6 5 5 3 1  output: 2 4 6
 Liệt kê các phần tử xuất nhiều hơn một lần trong dãy N
Ví dụ: input: 5 7 9 10 20 9 7 7 11  output: 7 9
 * */

public class Ex01 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList( 1, 2, 3, 4, 5, 6, 5, 5, 3, 1);
		
		List<Integer> uniqueNumbers = numbers.stream()
											 .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
											 .entrySet()
											 .stream()
											 .filter(number -> number.getValue() == 1)
											 .map(number -> number.getKey())
											 .collect(Collectors.toList());
		System.out.print("Unique numbers: ");
		uniqueNumbers.forEach(number -> System.out.print(number + "  "));
		
		System.out.println("\n==========================");
		
		List<Integer> duplicateNumbers = numbers.stream()
				 								.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				 								.entrySet()
				 								.stream()
				 								.filter(number -> number.getValue() > 1)
				 								.map(number -> number.getKey())
				 								.collect(Collectors.toList());
		System.out.print("Duplicate numbers: ");
		duplicateNumbers.forEach(number -> System.out.print(number + "  "));
	}
	
}
