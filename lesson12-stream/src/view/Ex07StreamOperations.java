package view;

import java.util.List;
import java.util.Arrays;
public class Ex07StreamOperations {
	public static void main(String[] args) {
		List<String> students = Arrays.asList("Smith","Terry","Adam");
		
		students.stream()
		.filter(student ->{
			System.out.println("Handling"+ student);
			return student.length() == 5;
		
		}).toArray(String[]:: new);
		System.out.println("Finished");
	}
}
