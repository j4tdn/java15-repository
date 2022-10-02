package view;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Ex07StreamOperations {
	public static void main(String[] args) {
		List<String> students = Arrays.asList("Smith", "Terry", "Adam");
		students.stream().filter(student -> {
			System.out.println("Handling " + student);
			return student.length() == 5;
		}).toArray(String[]::new);

		System.out.println("Finished ...");

		System.out.println("=======================");
		System.out.println("Map");

		List<String> words = Arrays.asList("KieBlog", "In", "God", "We trust");

		List<Integer> wordCount = words.stream().map(String::length).collect(Collectors.toList());

		wordCount.forEach(System.out::println);
		System.out.println("flapMap");
		List<String> enscriptLst = Arrays.asList("AABYAJWLZ", "DDA");
		List<String> enscriptLstAfterRemoveDup = enscriptLst.stream().map(s -> s.split("")).flatMap(Arrays::stream)
				.distinct().collect(Collectors.toList());
		enscriptLstAfterRemoveDup.forEach(System.out::println);
		// Điểm khác biệt cốt lõi giữa map và flatMap là kiểu trả về (return type).
		// Phương thức Stream map() chỉ xử lí và trả về duy nhất một kết quả, kết quả
		// này được trả về thông qua Output của stream.
		// Phương thức Stream flatMap() sẽ xử lí và trả về danh sách các stream.

		// 4.3 Finding and matching:

		/*
		 * Example: Give a list of numbers: 1, 2, 1, 4, 5, 8, 10, 4, 12  1 st: is there
		 * any element that is divisible by 10  2 nd: find the first element that is
		 * divisible by 4  3 nd: find the element that is divisible by 5 in the list 
		 * 4 th: does all elements less than 100  5 th: does no elements greater than 0
		 */
		List<Integer> numbers = Arrays.asList(1, 2, 1, 4, 5, 8, 10, 4, 12);

		//  1 st: is there any element that is divisible by 10

		boolean result1 = numbers.stream().anyMatch(n -> n % 10 == 0);
		System.out.println(result1);
		// 2 nd: find the first element that is divisible by 4
		int result2 = numbers.stream().
				filter(n -> n % 4 == 0).
				findFirst()
				.get();
		System.out.println(result2);
		// 3 nd: find the element that is divisible by 5 in the list 
//		List<Integer> result3 = numbers.stream()
//				.filter(n -> n % 5 == 0)
//				.findAny()
//				.collect(Collectors.toList());
//		result.forEach(System.out::println);  				
	}
}
