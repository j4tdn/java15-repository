package company;

public class AppCompany {
	public static void main(String[] args) {
		Director boss = new Director("Bill Gates", 12, 6.5f, 2.5f);
		Leader leader1 = new Leader("Steven", 8, 2.8f, 2);
		Staff staff1 = new Staff("Ronaldo", 7, 1.98f, "Marketing");
		Staff staff2 = new Staff("Messi", 10, 2.0f, "Human Resource");

		Human[] humanRace = { boss, leader1, staff1, staff2 };
		for (Human human : humanRace) {
		//	System.out.println(human);
		}
        Utils.caculateSalary(humanRace);
	}
}
