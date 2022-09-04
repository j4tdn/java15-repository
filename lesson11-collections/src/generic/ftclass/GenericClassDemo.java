package generic.ftclass;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class GenericClassDemo {
	public static void main(String[] args) {
		IList<Integer> numbers = new CustomList<>();
		
		numbers.add(2);
		numbers.add(5);
		numbers.add(8);
		numbers.add(3, 3456);
		numbers.addif(1, t -> t > 0);
		System.out.println("size: " + numbers.size());
		numbers.iterate(number -> System.out.println(number + " "));
		
		
		//do not support forEach
		//do not support iterate
	}
}
