package Model;

import bean.ItemDetail;

public class DataModel {
	private DataModel () {
		
	}
	public static ItemDetail[] getItemDetails() {
		return new ItemDetail[] {
			new ItemDetail(101, 1, "Item 101", 35),
			new ItemDetail(201, 2, "Item 201", 35),
			new ItemDetail(301, 3, "Item 301", 35),
			new ItemDetail(401, 4, "Item 401", 35),
			new ItemDetail(102, 1, "Item 102", 35),
			new ItemDetail(202, 2, "Item 103", 35),
			new ItemDetail(302, 3, "Item 104", 35),
		};
	}
}
