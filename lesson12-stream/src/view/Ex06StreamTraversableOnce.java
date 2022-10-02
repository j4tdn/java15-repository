package view;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;



public class Ex06StreamTraversableOnce {
	public static void main(String[] args) {
			
	List<String> elements = Arrays.asList("a","b","c");
	Stream<String> streams = elements.stream();
	streams.forEach(System.out::println);
	streams.forEach(System.out::println);
     	
	}
	

}
