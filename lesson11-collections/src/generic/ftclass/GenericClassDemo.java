package generic.ftclass;

import java.util.function.Consumer;

public class GenericClassDemo {
	public static void main(String[] args) {
		IList<Integer> numbers = new CustomList<>();

		numbers.add(2);
		numbers.add(5);
		numbers.add(6);
		numbers.add(2);
		System.out.println("capacity: " + numbers.getCapacity());
		numbers.add(5);
		System.out.println("capacity: " + numbers.getCapacity());

		numbers.add(6);
		System.out.println("size: " + numbers.size());

		numbers.iterate(number -> System.out.println(number + " "));
//		numbers.iterate(System.out::println);
		// do not support forEach
		// do not suppoer iterate
		

	}
}
