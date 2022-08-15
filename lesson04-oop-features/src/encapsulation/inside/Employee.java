package encapsulation.inside;

public class Employee extends EmpInfo{
	// .java ==> class A ==> A.class
	// .java ==> class B ==> B.class
	public static void main(String[] args) {
		Company company = new Company();
		System.out.println(company.name);
		System.out.println(company.numberOfEmpls);
		
		Employee inside = new Employee();
		System.out.println(inside.name);
		System.out.println(inside.skills);
		System.out.println(inside.salary);
		
		// Manager manager = new Manager();
		// System.out.println(manager.);
	}
}

class Department {
	public static void main(String[] args) {
		System.out.println("Department # main");
	}
}
