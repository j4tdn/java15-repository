package ex02.model;

import java.util.ArrayList;
import java.util.List;

import ex02.bean.CD;

public class CDModel {
	public static List<CD> getAllCDs() {
		List<CD> CDs = new ArrayList<>();
		CDs.add(new CD(101, "Indie", "Vu", 10, 1500000));
		CDs.add(new CD(102, "Bolero", "Quang Le", 15, 1000000));
		CDs.add(new CD(103, "RnB", "Soobin Hoang Son", 5, 1200000));
		CDs.add(new CD(104, "Rock", "Imagine Dragons", 10, 2000000));
		return CDs;
	}
}
