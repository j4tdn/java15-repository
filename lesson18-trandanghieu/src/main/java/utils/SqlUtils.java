package utils;

import java.util.List;

public class SqlUtils {
	private SqlUtils() {
		
	}
	public static <Element> void print(String prefix,Element element) {
		System.out.println(prefix + ">>>"+ element);
	}
	public static <Element> void print(List<Element> elements) {
		for(Element element : elements) {
			System.out.println(element);
		}
	}
}
