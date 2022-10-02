package view;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex06StreamTraversableonce {

	public static void main(String[] args) {
		//Duyệt : loop, traver, iterate, enumerate
		List<String> elements = Arrays.asList("a", "b", "c");
		Stream<String> stream = elements.stream();
		stream.forEach(System.out::println);
		stream.forEach(System.out::println);
		
	}

}
