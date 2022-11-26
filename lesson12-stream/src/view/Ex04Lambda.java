package view;

import java.util.Arrays;
import java.util.function.Consumer;

public class Ex04Lambda {
	public static void main(String[] args) {
		Consumer<Integer> consumer = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(numbers);
				
			}
			
		};
		
		consumer = (number) -> {
			System.out.println(numbers);
		};
		Arrays.asList(1,2,3);
	}
}
