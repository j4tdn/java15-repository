package company;

import java.time.LocalDate;

public class App {
	public static void main(String[] args) {
		Director director = new Director("Ben", LocalDate.of(1980, 12, 20), 2f, 3f);
		Manager manager = new Manager("Jack", LocalDate.of(1990, 6, 14), 1.5f, 20);
		Employee employee = new Employee("Jessica", LocalDate.of(1998, 1, 12), 1f, "Architecture");
		User[] users = { director, manager, employee };
		for (User user : users) {
			System.out.println(user);
		}
		calSalary(users);
	}

	public static void calSalary(User[] users) {
		for (User user : users) {
			if (user instanceof Director) {
				Director dr = (Director) user;
				System.out.println(
						"Salary of Director " + dr.getName() + " is: " + (dr.getPositionCoefficient() + dr.getCoefficientSalary()) * 3000000);
			} else if (user instanceof Manager) {
				Manager mg = (Manager) user;
				System.out.println("Salary of Manager " + mg.getName() + " is: " + mg.getCoefficientSalary() * 2200000);
			} else
				System.out.println("Salary of Employee " + user.getName() + " is: " + user.getCoefficientSalary()* 1250000);
		}
	}

}
