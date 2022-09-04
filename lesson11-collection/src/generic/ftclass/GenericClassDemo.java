package generic.ftclass;

import java.util.function.Consumer;

public class GenericClassDemo {
    public static void main(String[] args) {
		Ilist<Integer> numbers = new CustomList<>();
		numbers.add(2);
		numbers.add(5);
		numbers.add(8);
		numbers.add(2);
		numbers.add(5);
		numbers.add(8);
		
		System.out.println("size :" + numbers.size());
		
		numbers.iterate(number -> System.out.println(number + " "));
		
		System.out.println("capacity :" + numbers.getCapacity());
		// do not support forEach
		// do not support iterate
		
	}
}
