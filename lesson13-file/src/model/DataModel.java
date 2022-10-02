package model;

import java.util.Arrays;
import java.util.List;

import bean.Customer;

public class DataModel {
   private DataModel() {
	// TODO Auto-generated constructor stub
}
   public static List<Customer> getCustomers(){
	   return Arrays.asList(
			   new Customer(1, "Susan", 28, "Milan"),
			   new Customer(3, "Henry", 22, "Paris"),
			   new Customer(4, "Smith", 35, "London"),
			   new Customer(5, "Totti", 43, "Lepzig"),
			   new Customer(2, "Toto", 18, "Porto"));
   }
}
