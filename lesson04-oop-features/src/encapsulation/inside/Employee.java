package encapsulation.inside;

public class Employee extends EmployeeIn4 {
	public static void main(String[] args) {
		Employee inside = new Employee();
		Company company = new Company();
		System.out.println(company.numberOfEmployees);
		System.out.println(company.name);
		System.out.println(inside.name);
		System.out.println(inside.salary);
		System.out.println(inside.skills);
	}
}
