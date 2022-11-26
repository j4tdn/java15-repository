package model;

import java.util.Arrays;
import java.util.List;

import bean.Customer;

public class DataModel {
	private DataModel() {
		
	}
	
	public static List<Customer> getCustomer(){
		return Arrays.asList(
				new Customer(1, "Susan", 28, "MiLan"),
				new Customer(2, "Toto", 28, "Porto"),
				new Customer(3, "Henry", 28, "Paris"),
				new Customer(4, "Smith", 28, "London"),
				new Customer(5, "Totti", 28, "Lepzig"));
	}
}
