package encapsulation.outside;

import encapsulation.inside.EmployeeInfo;

public class ExternalEmployee extends EmployeeInfo {
	public static void main(String[] args) {
		ExternalEmployee outside = new ExternalEmployee();
		System.out.println(outside.name);
		System.out.println(outside.skills);
	}
}
