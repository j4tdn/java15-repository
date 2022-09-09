package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import bean.CDDisk;

public class DataModel {
	private DataModel() {

	}

	public static List<CDDisk> getListCD() {
		List<CDDisk> listCD = new ArrayList<>();

		listCD.add(new CDDisk(1, "Music CD", "Charlie Puth", 9, 3.5f));
		listCD.add(new CDDisk(2, "Music CD", "Selena Gomez", 3, 13.5f));
		listCD.add(new CDDisk(3, "Music CD", "Taylor Swift", 12, 43.5f));
		listCD.add(new CDDisk(9, "Dance CD", "Justin", 2, 33.5f));
		listCD.add(new CDDisk(5, "Guitar CD", "Sungha Jung", 10, 63.5f));
		listCD.add(new CDDisk(6, "Guitar CD", "Jackie Lau", 7, 32.4f));

		return listCD;
	}
}
