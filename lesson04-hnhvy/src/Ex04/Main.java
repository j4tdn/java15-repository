package Ex04;

public class Main {
	
		public static void main(String[] args) {
			Person p1 = new Director("Vy", "19-5-1999", 4.0f, 5.0f);
			Person p2 = new Manager("Y", "1-4-1998", 2.5f, 3.0f);
			Person p3 = new Employee("My", "1-6-1997", 1.5f, "Marketing");
			Person p4 = new Employee("Lien", "2-3-1992", 2.0f, "Financial");
			
			System.out.println("Salary of each type of personnel");
			System.out.println("Director: " + p1.salary());
			System.out.println("Manager: " + p2.salary());
			System.out.println("Employees: " + p3.salary() + ", " + p4.salary());
			
		}
}
