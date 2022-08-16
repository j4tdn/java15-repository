package model;

import bean.ItemDetail;

public class DataModel {
	private DataModel() {
		// TODO Auto-generated constructor stub
	}

	public static ItemDetail[] getItemDetails() {
    	return new ItemDetail[] {
    			new ItemDetail(101, 1, "Item 101", 35),
    			new ItemDetail(201, 2, "Item 201", 17),
    			new ItemDetail(301, 3, "Item 301", 29),
    			new ItemDetail(401, 4 ,"Item 401", 55),
    			new ItemDetail(102, 1, "Item 101", 16),
    			new ItemDetail(202, 2, "Item 202", 65),
    			new ItemDetail(302, 3, "Item 302", 18)
    			
    	};
    }
}
