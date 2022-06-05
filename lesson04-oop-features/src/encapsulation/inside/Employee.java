package encapsulation.inside;

public class Employee extends EmployeeInfo{

	public static void main(String[] args) {
		Company company = new Company();
		System.out.println(company.name);
		System.out.println(company.numberOfEmployees);
		
		Employee inside = new Employee();
		System.out.println(inside.name);
		System.out.println(inside.salary);
		System.out.println(inside.skills);
	}

}
//Chạy class chứ không chạy 