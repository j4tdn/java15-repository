package encapsulation.inside;

import encapsulation.Manager;

public class Employee extends EmpInfo{
	public static void main(String[] args) {
		Company company = new Company();
		System.out.println(company.name);
		System.out.println(company.numberOfEmpls);
		
		Employee employee = new Employee();
		System.out.println(employee.name);
		System.out.println(employee.salary);
		System.out.println(employee.skills);
		
		Manager manager = new Manager();
//		System.out.println(manager.<can't chấm>);
		
	}
}
