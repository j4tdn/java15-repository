package encapsultion.outside;

import encapsultion.inside.EmpInfo;

public class ExternalEmployee extends EmpInfo{
	public static void main(String[] args) {
		ExternalEmployee outside = new ExternalEmployee();
		System.out.println(outside.name);
		System.out.println(outside.skills);
	}
}
