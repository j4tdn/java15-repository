package view;

import bean.CD;
import genenric.CustomObjectList;
import genenric.OList;

public class Ex02 {
	public static void main(String[] args) {
		OList<CD> oList = new CustomObjectList<>();
		oList.add(new CD("1", "pop", "Sơn Tùng MTP", 10, 9000000));
		oList.add(new CD("2", "ballad", "Trịnh Công Sơn", 100,20000000));
		oList.add(new CD("3", "Disco", "Bee Gees", 15, 9000000));
		oList.add(new CD("3", "Disco", "Bee Gees", 15, 9000000));
		oList.iterate(System.out::println);
	}
}
