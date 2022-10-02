package utils;

import java.util.Arrays;
import java.util.List;

import bean.SinhVien;

public class DataModel {
	public static List<SinhVien> getTSs() {
		return Arrays.asList(new SinhVien(1), new SinhVien(2), new SinhVien(3), new SinhVien(4), new SinhVien(5),
				new SinhVien(6), new SinhVien(7), new SinhVien(8), new SinhVien(9), new SinhVien(10));
	}
}
