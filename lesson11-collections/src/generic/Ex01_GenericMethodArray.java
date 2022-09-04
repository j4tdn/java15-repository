package generic;

public class Ex01_GenericMethodArray {
	public static void main(String[] args) {
		Integer[] integers = {1,2,3,4,5};
		Double[] doubles = {1.1d,2.2d,3.3d,4.4d,5.5d};
		String[] strings = {"a", "b", "c", "d"};
		printfWithGeneric(integers);
		printfWithGeneric(doubles);
		printfWithGeneric(strings);
		compare(integers, doubles);
		//compareWithGeneric(integers, strings);
		compareWithGeneric(integers, doubles);
	}
	
	private static <Element> void printfWithGeneric(Element[] elements) {
		for(Element element:elements) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
	private static void printf(Object[] o) {
		for(Object object:o) {
			System.out.print(object + " ");
		}
		System.out.println();
	}
	private static void compare(Object[] actual, Object[] expected) {
		System.out.println(actual.equals(expected));
	}
	private static <Element extends Number> void compareWithGeneric(Element[] actual, Element[] expected) {
		System.out.println(actual.equals(expected));
	}
}
