package view;

import persistence.Employee;
import persistence.Title;
import service.EmployeeService;
import service.EmployeeServiceImp;

public class EmployeeView {
	private static EmployeeService employeeservice;

	static {
		employeeservice = new EmployeeServiceImp();
	}
	public static void main(String[] args) {
		Title title = new Title(2);
		Employee employee = new Employee(147, "Teo", "the9@gmail.com", "123456789", "On the road", "teo147test", title);
		employeeservice.save(null);
		Employee employee2 = employeeservice.login("the9@gmail.com", "123456789");
		if (employee2 == null) {
			System.out.println("Wrong username || password");
		} else {
			System.out.println("Sign in successfully ...");
			System.out.println("Welcome " + employee2.getName()+"to this platform");
		}
	}
}
