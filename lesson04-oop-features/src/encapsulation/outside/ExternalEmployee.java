package encapsulation.outside;

import encapsulation.inside.EmpInfo;
import encapsulation.inside.Employee;

public class ExternalEmployee extends EmpInfo {
	public static void main(String[] args) {
		ExternalEmployee outside = new ExternalEmployee();
		System.out.println(outside.name);
		System.out.println(outside.skills);
		
		Employee inside = new Employee();
		
	}
}
