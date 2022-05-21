package encapsulation.inside;

public class Employee extends EmpInfo {
	public static void main(String[] args) {
		Company company = new Company();
		System.out.println(company.name);
		System.out.println(company.numberOfEmpls);
		
		Employee employee = new Employee();
		System.out.println(employee.name);
		System.out.println(employee.skills);
		System.out.println(employee.salary);
	}
}
