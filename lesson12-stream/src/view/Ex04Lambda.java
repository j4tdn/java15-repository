package view;

import java.util.Arrays;
import java.util.function.Consumer;

public class Ex04Lambda {

	public static void main(String[] args) {
		
		
		
		Consumer<Integer> consumer = new Consumer<Integer>() {
			@Override
			public void accept(Integer number) {
				System.out.println(number);
			}
			
		};
		
		consumer = (number) ->{
			System.out.println(number);
		};
		
		Arrays.asList(1,2,3).forEach(consumer);
		
		
	}

}
