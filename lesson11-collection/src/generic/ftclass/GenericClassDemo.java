package generic.ftclass;

import java.util.function.Consumer;

public class GenericClassDemo {
	public static void main(String[] args) {
		IList<Integer> numbers = new CustomList<>();
		numbers.add(2);
		numbers.add(4);
		numbers.add(8);

		System.out.println("size: " + numbers.size());

		numbers.interate(number -> System.out.println(number + " "));

			
	}
}
