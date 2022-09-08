package Ex02;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
	private DataProvider() {
	};

	public static List<CD> getCDs() {
		List<CD> cds = new ArrayList<>();
		cds.add(new CD(1, "Soft", "Bruno Mars", 5, 200));
		cds.add(new CD(2, "Soft", "Drake", 6, 220));
		cds.add(new CD(3, "Hard", "Kien Trinh", 4, 300));
		cds.add(new CD(4, "Soft", "The Weeknd", 8, 500));
		cds.add(new CD(5, "Hard", "Michael Jackson", 4, 570));
		cds.add(new CD(6, "Hard", "Vu", 10, 350));

		return cds;
	}
}