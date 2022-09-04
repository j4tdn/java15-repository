package generic;

import java.util.Objects;

public class Ex01GeneticMethodArray {

	public static void main(String[] args) {
		Integer[] integers = { 1, 2, 3, 4, 5 };
		Double[] doubles = { 1.1d, 2.3d, 3.3d, 4.4d, 5.5d };
		String[] strings = { "a", "b", "c", "d" };
//		printf(integers);
//		printf(doubles);
//		printf(strings);
		System.out.println("=====================");
		printfWithGeneric(integers);
		printfWithGeneric(doubles);
		printfWithGeneric(strings);
		
		
	}
	
	private static <Element> void printfWithGeneric(Element[] elements) {
		System.out.println("======>");
		for(Element element : elements) {
			System.out.println(element+" ");
		}
		System.out.println();
	}
	
	private static <Element extends Number> void compareWithGeneric(Element[] actual , Element a) {
		System.out.println(actual);
	}

}
