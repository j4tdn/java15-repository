package encapsulation.inside;

public class Employee extends EmpInfo {
		
	public static void main(String[] args) {
		Company company = new Company();
		System.out.println(company.name);
		System.out.println(company.NumberOfEmpls);
		Employee inside = new Employee();
		System.out.println(inside.name);
		System.out.println(inside.skills);
		System.out.println(inside.salary);
	}

}
