package companyStaffManagement;

public class App {
	public static void main(String[] args) {
		President ps = new President("Tran Cong Nguyen Hai", "20.09.2002", 5.5f, 0.5f);
		Manager mng = new Manager("Tran Van A", "29.2.2002", 3.5f, 10);
		Employee emp1 = new Employee("Tran Van B", "28.3.2002", 1.5f, "Nhan su");
		Employee emp2 = new Employee("Tran Van C", "27.3.2002", 1.5f, "Tai chinh");

		Person[] persons = { ps, mng, emp1, emp2 };

		System.out.println("Information of Staff: ");
		for (int i = 0; i < persons.length; i++) {
			System.out.println(persons[i]);
		}
		
		System.out.println("==============================");
		for(int i = 0; i<persons.length; i++) {
			System.out.println("Salary of: " + persons[i].getFullName() +" is " + persons[i].Salary());
			
		}
	}
}
