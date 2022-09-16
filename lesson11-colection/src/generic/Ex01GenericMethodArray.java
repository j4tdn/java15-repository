package generic;

public class Ex01GenericMethodArray {
	public static void main(String[] args) {
		Integer[] integers = { 1, 2, 3, 4, 5 };
		Double[] doubles = { 1.1d, 2.2d, 3.3d, 4.4d, 5.5d };
		String[] strings = { "a", "b", "c", "d" };
		
		compareWithGenericMethod(strings, doubles);
		compareWithGenericMethod(integers, doubles);
		printf(integers);
		printf(doubles);
		printf(strings);
		
	}
	private static <E> void printfWithGeneric(E[] elements) {
		System.out.print("=====> ");
		for(E element: elements) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
	
	private static void printf(Object[] objects) {
		System.out.print("=====> ");
		for(Object object: objects) {
			System.out.print(object + " ");
		}
		System.out.println();
		
	}
	
	private static <E extends Number> void compareWithGenericMethod(E[] actual, E[] e) {
		System.out.println(actual.equals(e));
	}
	private static <E> void compareWithGenericMethod(Object[] actual, Object[] e) {
		System.out.println(actual.equals(e));
	}
}