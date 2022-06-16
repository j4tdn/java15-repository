package view;

import java.time.LocalDate;

import bean.Employee;
import bean.Manager;
import bean.President;

public class AppHumanResources {
	public static void main(String[] args) {
		President p1 = new President("Nguyen An","15/10/1969",4f,2.3f);
		Manager m1 = new Manager ("Nguyen Thuy Hang","08/04/1999",3f,50);
		Employee e1 = new Employee("VTPL", "29/04/1992",2f,"Kinh doanh");
		Employee e2 = new Employee("LTAT", "02/01/2000",2f,"Tai chinh");
	
		System.out.println("Employee information: ");
		System.out.println(p1);
		System.out.println(m1);
		System.out.println(e1);
		System.out.println(e2);
	}
	
	
}
