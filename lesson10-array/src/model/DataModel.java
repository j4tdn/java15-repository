package model;

import bean.ItemDetail;

public class DataModel {
	private DataModel() {
		
	}
	
	public static ItemDetail[] getItemDetails() {
		return new ItemDetail[] {
				new ItemDetail(101, 1, "Item 101", 35),
				new ItemDetail(201, 2, "Item 201", 45),
				new ItemDetail(301, 3, "Item 301", 65),
				new ItemDetail(401, 4, "Item 401", 325),
				new ItemDetail(102, 1, "Item 102", 55),
				new ItemDetail(202, 2, "Item 202", 77),
				new ItemDetail(303, 3, "Item 303", 898),
		};
	}
	
	public static ItemDetail[] getItemDetailsWithNull() {
		return new ItemDetail[] {
				new ItemDetail(101, 1, "Item 101", 35),
				null, null,
				new ItemDetail(201, 2, "Item 201", 45),
				new ItemDetail(301, 3, "Item 301", 65),
				new ItemDetail(401, 4, "Item 401", 325),
				new ItemDetail(102, 1, "Item 102", 55),
				null,
				new ItemDetail(202, 2, "Item 202", 77),
				new ItemDetail(303, 3, "Item 303", 898),
				null
		};
	}
}
