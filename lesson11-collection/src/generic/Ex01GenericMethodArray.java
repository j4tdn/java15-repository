package generic;

public class Ex01GenericMethodArray {
	public static void main(String[] args) {
		Integer[] integers = {1, 2, 3, 4 ,5};
		Double[] doubles = {1.1d, 2.2d, 3.3d, 4.4d, 5.5d};
		String[] strings = {"a", "b", "c", "d"};
		
		compareWithGeneric(integers, doubles);
		
		prinf(integers);
		prinf(doubles);
		prinf(strings);
		
		System.out.println("=================");
		
		
		prinfWithGeneric(integers);
		prinfWithGeneric(doubles);
		prinfWithGeneric(strings);
	}
	private static <Element> void prinfWithGeneric(Element[] elements) {
		System.out.println("Generic===> ");
		for(Object element : elements) {
			System.out.println(element + " ");
		}
		System.out.println();
	}
	private static void prinf(Object[] objects) {
		System.out.println("===> ");
		for(Object object : objects) {
			System.out.print(object + " ");
		}
		System.out.println();
	}
	
	private static <Element extends Number> void compareWithGeneric(Element[] actual, Element[] expected) {
		System.out.println(actual.equals(expected));
	}
}
