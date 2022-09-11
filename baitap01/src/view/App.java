package view;

import static java.util.Comparator.comparing;
import static java.util.Comparator.nullsLast;
import static java.util.Comparator.reverseOrder;

import java.util.Arrays;

import bean.Employee;
import model.DataModel;

public class App {
	

	public static void main(String[] args) {
		
		Employee[] employees = DataModel.getDataModel();
		
		
		
		Arrays.sort(employees, nullsLast(comparing(Employee::getAddress, reverseOrder())
									.thenComparing(Employee::getAge, reverseOrder()))) ;
		
		System.out.println(Arrays.toString(employees));
	}
}
