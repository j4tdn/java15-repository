package view;

import java.util.Arrays;
import java.util.List;

public class Ex07StreamOperation {
	public static void main(String[] args) {
		List<String> students=Arrays.asList("Smith","Jerry","Adam");
		students.stream()
				.filter(t->{
					System.out.println("Handing: "+ t);
					return t.length()==5;
				}).toArray(String[]::new);
		
		
		System.out.println("Finished...");
	}
}
