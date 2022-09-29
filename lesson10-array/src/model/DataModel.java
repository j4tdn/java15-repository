package model;

import bean.ItemDetail;

public class DataModel {
	public DataModel() {
		// TODO Auto-generated constructor stub
	}

	public static ItemDetail[] getItemDetail() {
		return new ItemDetail[]
				{
			new ItemDetail(101, 1, "Item101", 35),
			new ItemDetail(201, 2, "Item201", 35),
			new ItemDetail(301, 3, "Item301", 35),
			null,
			new ItemDetail(401, 4, "Item401", 35),
			new ItemDetail(102, 1, "Item102", 35),
			new ItemDetail(202, 2, "Item202", 35),
			new ItemDetail(302, 3, "Item302", 35)};
	}
}
