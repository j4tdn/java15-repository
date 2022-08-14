package model;

import bean.ItemDetail;

public class DataModel {
	private DataModel()
	{
		
	}
	public static ItemDetail[] getItemDetails()
	{
		return new ItemDetail[] {
			new ItemDetail(101, 1, "Item 101", 35),
			new ItemDetail(201, 2, "Item 201", 17),
			new ItemDetail(301, 3, "Item 301", 29),
			new ItemDetail(401, 4, "Item 401", 55),
			new ItemDetail(501, 1, "Item 501", 16),
			new ItemDetail(601, 2, "Item 601", 200),
		};
	}
	public static ItemDetail[] getItemDetailsWithNull()
	{
		return new ItemDetail[] {
			new ItemDetail(101, 1, "Item 101", 35),
			null,
			null,
			new ItemDetail(201, 2, "Item 201", 17),
			new ItemDetail(301, 3, "Item 301", 29),
			new ItemDetail(401, 4, "Item 401", 55),
			new ItemDetail(501, 1, "Item 501", 16),
			null,
			new ItemDetail(601, 2, "Item 601", 200),
		};
	}
}	
