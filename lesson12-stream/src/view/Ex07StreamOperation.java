package view;

import java.util.Arrays;
import java.util.List;

public class Ex07StreamOperation {

	public static void main(String[] args) {
		List<String> students =	Arrays.asList("Smith","Terry" , "Adam");
		//collector(Colletors.toList, Mao, Set, joining)
		students.stream()
				.filter(student -> {
			System.out.println("Handling :" + student);
			return student.length() == 5;
		}).toArray(String[]::new);
		System.out.println("===");
	}

}
