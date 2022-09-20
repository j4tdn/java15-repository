package view;

import java.util.Arrays;
import java.util.List;

public class Ex07StreamOperations {
	public static void main(String[] args) {
		List<String> students = Arrays.asList("Smith", "Terry", "Adam");
		students.stream()
				.filter(s -> {
					System.out.println("Handling ...");
					return s.length() == 5;
				}).toArray(String[]::new);
		System.out.println("Finished");
	}
	
}
