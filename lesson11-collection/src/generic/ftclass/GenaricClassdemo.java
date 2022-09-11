package generic.ftclass;

public class GenaricClassdemo {
		public static void main(String[] args) {
			IList<Integer> numbers = new CustomList<>();
			numbers.add(2);
			numbers.add(2);
			numbers.add(9);
			numbers.add(4);
			numbers.add(7);
			numbers.add(0, 8);
			numbers.remove(4);
			
			System.out.println("size "  + numbers.size());
			
			numbers.iterate(number -> System.out.print(number + " "));
			System.out.println("+++++++==");
			System.out.println(numbers.get(5));
		}
}
