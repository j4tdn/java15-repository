package generic;

public class Ex01GenericMethod {
	public static void main(String[] args) {
		Integer[] integers = {1,2,3,4,5};
		Double[] doubles = {1.1d,2.2d,3.3d,4.4d,5.5d};
		String[] strings = {"a", "b", "c", "d"};
		
		compare(integers, strings);
		compareWithGeneric(doubles, integers);
		
		printf(integers);
		printf(doubles);
		printf(strings);
		printfWithGeneric(integers);
		printfWithGeneric(doubles);
		printfWithGeneric(strings);
	}
	
	private static void printf(Object[] objects) {
		System.out.println("=====>");
		for(Object object : objects) System.out.println(object + " ");
		System.out.println();
	}
	
	private static <Element> void printfWithGeneric(Element[] elements) {
		System.out.println("=====>");
		for(Object element : elements) System.out.println(element + " ");
		System.out.println();
	}
	
	private static void compare(Object[] actual, Object[] expected) {
		System.out.println(actual.equals(expected));
	}
	
	private static <Element extends Number> void compareWithGeneric(Element[] actual, Element[] expected) {
		System.out.println(actual.equals(expected));
	}
	
	
}
