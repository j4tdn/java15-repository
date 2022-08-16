package model;

import bean.ItemDetail;

public class DataModel {
	private DataModel() {
		
	}
	public static ItemDetail[] getItemDetail() {
		return new ItemDetail[] {
				new ItemDetail(101, 1, "Item 201", 35),
				new ItemDetail(201, 2, "Item 301", 35),
				new ItemDetail(301, 3, "Item 401", 35),
				new ItemDetail(401, 4, "Item 501", 35),
				new ItemDetail(501, 5, "Item 601", 35),
				new ItemDetail(601, 6, "Item 701", 35),
				new ItemDetail(701, 7, "Item 801", 35),
				
				
		};
	}
}
