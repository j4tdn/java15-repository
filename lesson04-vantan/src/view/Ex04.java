package view;

import java.time.LocalDate;

import bean.Director;
import bean.Employee;
import bean.Leader;
import bean.People;

public class Ex04 {
	public static void main(String[] args) {
		Director director1 = new Director("david", LocalDate.of(1990, 10, 4), 3, 2);
		Leader leader = new Leader("Bruno", LocalDate.of(1999, 2, 1), 2, 15);
		Employee employee1 = new Employee("Joan", LocalDate.of(2000, 12, 7), 2, "Designer");
		Employee employee2 = new Employee("Segio", LocalDate.of(2001, 11, 5), 2, "Maketing");
		
		People[] peoples = {director1, leader, employee1, employee2};
		for (People people : peoples) {
			System.out.println(people.toString());
			System.out.println("salary: " + people.salary());
		}
		
	}
}
