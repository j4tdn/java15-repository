package model;
import bean.*;
public class DataModel {
	private DataModel(){
		
	}
	public static ItemDetail[] getItemDetails() {
		return new ItemDetail[] {
			new ItemDetail(101,1,"Item 101", 35),
			new ItemDetail(102,2,"Item 201", 17),
			new ItemDetail(103,3,"Item 301", 29),
			new ItemDetail(104,4,"Item 401", 55),
			new ItemDetail(105,1,"Item 102", 16),
			new ItemDetail(106,2,"Item 202", 48),
			new ItemDetail(107,3,"Item 200", 200),
			
		};
	}
	public static ItemDetail[] getItemDetailsWithNull() {
		return new ItemDetail[] {
			new ItemDetail(101,1,"Item 101", 35),
			new ItemDetail(102,2,"Item 201", 17),
			new ItemDetail(103,3,"Item 301", 29),
			null,
			new ItemDetail(104,4,"Item 401", 55),
			new ItemDetail(105,1,"Item 102", 16),
			new ItemDetail(106,2,"Item 202", 48),
			new ItemDetail(107,3,"Item 200", 200),
			null,
			
		};
	}
}
