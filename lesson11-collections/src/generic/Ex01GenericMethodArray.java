package generic;

public class Ex01GenericMethodArray {
	public static void main(String[] args) {
		Integer[] integers = { 1, 2, 3, 4, 5 };
		Double[] doubles = { 1.1d, 2.2d, 3.3d, 4.4d, 5.5d };
		String[] strings = { "a", "b", "c", "d" };

		compare(integers, strings);
		compareWithGeneric(integers, doubles);
		
		printf(integers);
		printf(doubles);
		printf(strings);

		System.out.println("=====================");

		printfWithGeneric(integers);
		printfWithGeneric(doubles);
		printfWithGeneric(strings);
	}

	private static <Element extends Number> void compareWithGeneric(Element[] actual, Element[] expect) {
		System.out.println(actual.equals(expect));
	}

	private static void compare(Object[] actual, Object[] expect) {
		System.out.println(actual.equals(expect));
	}

	private static <Element> void printfWithGeneric(Element[] elements) {
		System.out.print("Generic ====> ");
		for (Element element : elements) {
			System.out.print(element + " ");
		}
		System.out.println();
	}

	private static void printf(Object[] objects) {
		System.out.print("====> ");
		for (Object object : objects) {
			System.out.print(object + " ");
		}
		System.out.println();
	}

}
