package view;

import java.util.Arrays;
import java.util.function.Consumer;

public class Ex04Lambda {
	// signature
	// Supplier, Consumer, Predicate, Function
	// BiFunction, Comparator
	
	// Create an instance of functional interface
	public static void main(String[] args) {
		Consumer<Integer> consumer = new Consumer<Integer>() {
			@Override
			public void accept(Integer number) {
				System.out.println(number);
			}
		};
		
		// using lambda --> anonymous function
		// short version to create an instance of functional interface
		consumer = (number) -> {
			System.out.println(number);
		};
		
		Arrays.asList(1,2,3).forEach(consumer);
	}
}
