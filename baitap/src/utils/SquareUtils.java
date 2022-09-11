package utils;

import bean.Square;

public class SquareUtils {
	private SquareUtils() {
	}
	
	public static int pre() {
		Square square = new Square();
		return square.getHeight() * square.getWidth();
	}
}
