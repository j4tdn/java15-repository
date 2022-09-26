package view;

import java.util.Arrays;
import java.util.List;

public class Ex07SttreamOperations {
	public static void main(String[] args) {
		List<String> students = Arrays.asList("Smith", "Terry", "Adam");
		// collector(Collectors.toList, Map, Set, joining)
		// array
		students.stream()
				.filter(student -> {
					System.out.println("Handling " + student);
					return student.length() == 5; // Stream<String>
				}).toArray(String[]::new);
		
		System.out.println("Finished ...");
		
	}
}
