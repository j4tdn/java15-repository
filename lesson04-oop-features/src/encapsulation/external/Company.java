package encapsulation.external;

import encapsulation.internal.Employee;

public class Company {
	public String name() {
		return "IT-DEV";
	}
	
	public int numberOfEmployees() {
		return 120;
	}
	
	private String[] customers() {
		return new String[] {"HP", "ASUS"};
	}
	
	public static void main(String[] args) {
		Company company = new Company();
		System.out.println("name: " + company.name());
		System.out.println("length: " + company.customers().length);
		
		Employee employee = new Employee();
		System.out.println("employee name: " + employee.name());
	}
} 