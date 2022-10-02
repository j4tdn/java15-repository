package view;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class Ex06StreamTraversbleOnce {

	public static void main(String[] args) {
		List<String> element = Arrays.asList("a","b","c");
		Stream<String> stream = element.stream();
		stream.forEach(System.out:: println);
		stream.forEach(System.out:: println);
		
	}

}
