package encapsulation.outside;

import encapsulation.inside.Company;

public class ExternalCompany {
	public String Name;
	private String policy;
	
	
	public static void main(String[] args) {
		Company company = new Company();
		System.out.println(company.name);
	}

}
