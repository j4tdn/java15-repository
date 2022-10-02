package utils;

import java.util.Arrays;
import java.util.List;

import bean.ThiSinh;

public class DataModel {
	public static List<ThiSinh> getTSs() {
		return Arrays.asList(new ThiSinh(1), new ThiSinh(2), new ThiSinh(3), new ThiSinh(4), new ThiSinh(5),
				new ThiSinh(6), new ThiSinh(7), new ThiSinh(8), new ThiSinh(9), new ThiSinh(10));
	}
}
