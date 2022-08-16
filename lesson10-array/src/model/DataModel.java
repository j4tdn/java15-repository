package model;

import bean.ItemDetail;

public class DataModel {
	
	
	public static ItemDetail[] getItemDetail() {
		return new ItemDetail[] {
				new ItemDetail(101,1, "Item 101" , 35),
				new ItemDetail(201,2, "Item 201" , 35),
				null,
				new ItemDetail(301,3, "Item 301" , 35),
				null,null,
				new ItemDetail(401,3, "Item 401" , 35),
				new ItemDetail(102,4, "Item 102" , 35),
				new ItemDetail(202,5, "Item 202" , 35),
				new ItemDetail(302,6, "Item 302" , 35),
		};
	}
}
