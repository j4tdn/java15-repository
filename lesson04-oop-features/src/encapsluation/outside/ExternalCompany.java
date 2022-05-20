package encapsluation.outside;

import encapsulation.inside.Company;

public class ExternalCompany {
	public String name;
	private String policy;
	
	public static void main(String[] args) {
		Company cp = new Company();
		System.out.println(cp.name);
		
	}

}
