package generic;

public class Ex01GenericMethodArray {
	public static void main(String[] args) {
		Integer[] intergers = { 1, 2, 3, 4, 5 };
		Double[] doubles = {1.1d, 2.2d, 3.3d, 4.4d, 5.5d};
		String[] strings = {"1", "2", "3", "4", "5"};
		
		compare(intergers, strings);
		compareWithGeneric(doubles, doubles);
		
		printf(intergers);
		printf(doubles);
		printf(strings);
		
		System.out.println("=================");
		
		printfWithGeneric(intergers);
		printfWithGeneric(doubles);
		printfWithGeneric(strings);
	}
	
	private static <Element> void printfWithGeneric(Element[] elements) {
		System.out.print("Generic ===> ");
		for (Element element: elements) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
	
	private static void printf(Object[] objects) {
		System.out.print("===> ");
		for (Object object: objects) {
			System.out.print(object + " ");
		}
		System.out.println();
	}
	
	private static <Element extends Number> void compareWithGeneric(Element[] actual, Element[] expected) {
		System.out.println(actual.equals(expected));
	}
	
	private static void compare(Object[] actual, Object[] expected) {
		System.out.println(actual.equals(expected));
	}
}
