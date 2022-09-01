package generic.ftclass;

public class GenericClassDemo {
	public static void main(String[] args) {
		IList<Integer> numbers = new CustomList<>();

		numbers.add(2);
		System.out.println("capacity: " + numbers.getCapacity());
		numbers.add(5);
		System.out.println("capacity: " + numbers.getCapacity());
		numbers.add(8);
		System.out.println("capacity: " + numbers.getCapacity());
		numbers.add(2);
		System.out.println("capacity: " + numbers.getCapacity());
		numbers.add(5);
		System.out.println("capacity: " + numbers.getCapacity());
		numbers.add(8);
		System.out.println("capacity: " + numbers.getCapacity());

		System.out.println("size: " + numbers.size());

		numbers.iterate(number -> System.out.print(number + " "));



		// do not support forEach
		// do not support iterate
	}
}
