package model;

import java.util.Arrays;
import java.util.List;

import bean.Customer;

public class DataModel {
	private DataModel() {
		
	}

	public static List<Customer> getCustomers(){
		return Arrays.asList(new Customer(1,"Susan",28,"Milan"),
				new Customer(2, "toto", 18, "Porto"),
				new Customer(3,"Henry",52,"Milan"));
	}

}
