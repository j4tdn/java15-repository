package generic;

public class Ex01GenericMethodArray {
	public static void main(String[] args) {
		Integer [] integers = {1,2,3,4,5};
		Double [] doubles= {1.1d,2.2d,3.3d,4.4d,5.5d};
		String[] strings = {"a","b","c","d"};
		printf(integers);
		printf(doubles);
		printf(strings);
	}
	private static<Element> void printfWithGeneric(Element[] elements) {
		System.out.println("Generic ===>");
		for(Element element :elements) {
			System.out.print( element + " ");
		}
	}
	private static void printf(Object[] objects) {
		for(Object object :objects) {
			System.out.print( object + " ");
		}
	}
	
}
