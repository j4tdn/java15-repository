package ex04;

public class Utils {
	public static void salary(Person[] persons) {
		double salary = 0;
		for(Person person: persons) {
			if(person instanceof Leader) {
				Leader ld = (Leader) person;
				salary = (ld.getCoefficientsSalary()+ld.getPositionCoefficient())*1250000;
				System.out.println(ld.toString() +" salary: "+ salary);
			}
			if(person instanceof Manager) {
				Manager mn = (Manager) person;
				salary = mn.getCoefficientsSalary()*2200000;
				System.out.println(mn.toString()+"   salary: "+salary);
			}
			if(person instanceof Employee) {
				Employee em = (Employee) person;
				salary = em.getCoefficientsSalary()*2200000;
				System.out.println(em.toString()+"    salary: "+ salary);
			}
		}
	}
}
