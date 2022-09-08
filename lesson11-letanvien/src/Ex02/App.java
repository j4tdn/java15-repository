package Ex02;

import java.util.Comparator;
import java.util.List;

public class App {
	public static void main(String[] args) {
		List<CD> cds = DataProvider.getCDs();
		boolean result = Utils.addCD(cds, new CD(1, "Soft", "Tao", 5, 430));

		System.out.print("Add cd to the list: ");
		System.out.println(result ? "Added successfully" : "Duplicated ID, Try again !");

		System.out.println();

		System.out.println("The quantily of the list of CD: " + Utils.getAllQuantily(cds));

		System.out.println();

		System.out.println("Total price : " + Utils.getTotalPrice(cds));

		System.out.println();

		cds.sort(Comparator.comparing(CD::getPrice, Comparator.reverseOrder()));
		System.out.println("Sorting Descending: ");
		Utils.printf(cds);

		System.out.println();

		cds.sort(Comparator.comparing(CD::getId));
		Utils.printf(cds);
	}
}