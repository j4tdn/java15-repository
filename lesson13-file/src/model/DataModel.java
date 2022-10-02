package model;

import java.util.Arrays;
import java.util.List;

import bean.Customer;

public class DataModel {
	private DataModel() {
		
	}
	public static List<Customer> getCustomers(){
		return Arrays.asList(
				
				new Customer(1,"Susan",28,"Milan"),
				new Customer(2,"ToTo",18,"Porto"),
				new Customer(3,"Henry",22,"Paris"),
				new Customer(4,"Smith",36,"LonDon"),
				new Customer(5,"Toti",43,"Lepzig")
				
				);
		 
	
	}
}
