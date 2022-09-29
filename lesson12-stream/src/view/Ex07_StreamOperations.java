package view;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Ex07_StreamOperations {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,1,3,3,2,4);
		numbers.stream()
		.filter(n -> n % 2 == 0)
		.map(d -> d.intValue())
		.distinct()
		.forEach(System.out::println);
		List<String> students = Arrays.asList("Smidfgth", "Terry", "Adam");
		//collector(Collectors.toList, Map, Set)
		List<Integer> num =  students.stream()
//		.filter(d -> {
//			//System.out.println("Handling " + d);
//		return d.length() == 5;
//		})
		.map(String::length)
		//.toArray(String[]::new);
		.collect(Collectors.toList());
		
		System.out.println("Finished...");
		System.out.println(num);
		
	}
}
