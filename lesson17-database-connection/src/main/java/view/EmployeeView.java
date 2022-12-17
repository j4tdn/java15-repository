package view;

import persistence.Employee;
import persistence.Title;
import service.EmployeeService;
import service.EmployeeServiceImpl;

public class EmployeeView {
	
	// dependency
	private static EmployeeService employeeService;
	
	static {
		// inject
		employeeService = new EmployeeServiceImpl();
	}
	
	public static void main(String[] args) {
		// teo147test, na258test
		// Employee employee = new Employee(258, "Na 147", "na258@edu.com", "753951365", "On the street", "na258test", new Title(1));
		// employeeService.save(employee);
		
		Employee employee = employeeService.login("na258@edu.com", "na258test");
		if (employee == null) {
			System.out.println("--> Wrong username || password");
		} else {
			System.out.println("--> Login sucessful ...");
			System.out.println("--> Welcome " + employee.getName() + "to the page ...");
		}
	}
}
