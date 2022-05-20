package encapsulation;

import encapsulation.inside.Employee;

public class Manager {
	protected String skills;
	double salary;
	
	public static void main(String[] args) {
		Employee employee = new Employee();
		System.out.println(employee.name);
	}
}
