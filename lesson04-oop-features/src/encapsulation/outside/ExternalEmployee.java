package encapsulation.outside;

import encapsulation.inside.EmployeeIn4;

public class ExternalEmployee extends EmployeeIn4 {
	public static void main(String[] args) {
        ExternalEmployee outside = new ExternalEmployee();
        System.out.println(outside.name);
        System.out.println(outside.skills);
      
	}
}
