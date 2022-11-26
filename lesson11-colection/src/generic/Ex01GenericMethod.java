package generic;

import javax.lang.model.util.Elements;

public class Ex01GenericMethod {
	public static void main(String[] args) {
		Integer[] intergers = {1, 2, 3, 4, 5};
		Double[] doubles = {1.1d, 2.2d, 3.3d, 4.4d, 5.5d};
		String[] strings = {"a", "b", "c", "d"};
		printf(strings);
		printf(doubles);
		printf(intergers);
		
		System.out.println("================");
		
		printfWithGeneric(strings);
		printfWithGeneric(doubles);
		printfWithGeneric(intergers);
	}
	
	private static void printf(Object[] objects) {
		System.out.println("===> ");
		for (Object object: objects) {
			System.out.println(object + " ");
		}
		
		System.out.println();
		
	}
	
	private static <Element> void printfWithGeneric(Element[] elements) {
		System.out.println("===> ");
		for (Element element: elements) {
			System.out.println(element + " ");
		}
		
		System.out.println();
		
	}
	
	private static void compare (Object[] actual, Object[] expected) {
		System.out.println(actual.equals(expected));
	}
}
