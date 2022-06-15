package company;

public class Utils {
	public static float caculateSalary(Human[] humanRace) {
		float salary = 0;
		for (Human human : humanRace) {
			if (human instanceof Director) {
				Director director = (Director) human;
				salary = (director.getTitleRatio() + director.getWageRatio()) * 3000000;
				System.out.println("director wage : " + salary);
			} else if (human instanceof Leader) {
				Leader leader = (Leader) human;
				salary = leader.getWageRatio() * 2200000;
				System.out.println("leader wage : " + salary);
			} else {
				Staff staff = (Staff) human;
				salary = staff.getWageRatio() * 1250000;
				System.out.println("staff wage :" + salary );
			}
		}
		return salary;
	}
}
