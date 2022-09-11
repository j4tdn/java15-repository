package genericftclass;

import java.util.function.Consumer;

public class GenericClassDemo {
	public static void main(String[] args) {
		IList<Integer> numbers = new CustomList<>();

		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		System.out.println("size: " + numbers.size());

		// do not support forEach
		// do not support interate
		
		/*
		 * 
		 numbers.iterate(new Consumer<Integer>() {

			@Override
			public void accept(Integer number) {
				System.out.println(number);
			}
		});
		
		 */

		numbers.iterate(number -> System.out.println(number));
		
		System.out.println("capacity: " + numbers.getCapacity());
		
		
	}
}
