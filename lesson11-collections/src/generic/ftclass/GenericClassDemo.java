package generic.ftclass;

import java.util.function.Consumer;

public class GenericClassDemo {
	public static void main(String[] args) {
		IList<Integer> numbers = new CustomList<>();
		numbers.add(2);
		numbers.add(3);
		
		System.out.println("size: " + numbers.size() );
		
		numbers.iterate( number -> System.out.println(number + " "));
		System.out.println("capaity: " + numbers.getCapacity());
 	}
}
