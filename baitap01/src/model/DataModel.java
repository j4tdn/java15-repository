package model;

import bean.Employee;

public class DataModel {
	
	private DataModel() {
		
	}
	
	public static Employee[] getDataModel() {
		return new Employee[] {new Employee("Nga", 19, "vinh ninh"),
								new Employee("Van", 24, "phu tho"),
								null,
								new Employee("My", 21, "thua thien hue"),
								null,
								};
	}
}
