package exam;

public class Ex04 {

	public static void main(String[] args) {

		People[] people = inputPeople();

		showInfomation(people);

	}

	public static People[] inputPeople() {
		People direction = new Director("Le Duc Khoa", "19/03/2003", 2, 3);
		People manager = new Manager("Le Bi", "24/01/2007", 2, 250);

		People staff1 = new Staff("Le Li", "24/7/2008", 1, "Ke Toan");
		People staff2 = new Staff("Le Vy", "28/5/2009", 1, "Ke Toan");

		People[] people = new People[] { direction, manager, staff1, staff2 };

		return people;
	}

	public static void showInfomation(People[] people) {

		for (People people1 : people) {
			people1.showinfo();
			System.out.println( "	Salary :" + people1.salary());

		}

	}

}