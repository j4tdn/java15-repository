package ex04;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Person leader = new Leader("Tran A", LocalDate.of(1988, 8, 8), 5, 1);
		Person manager = new Manager("Phan A", LocalDate.of(1990, 9, 9), 3, 10);
		Person employee1 = new Employee("Nguyen A", LocalDate.of(1999, 3, 4), 2, "Phong A");
		Person employee2 = new Employee("Nguyen B", LocalDate.of(2000, 4, 5), 2, "Phong B");
		Person[] persons = {leader,manager,employee1,employee2};
		Utils.salary(persons);
		}
	}
