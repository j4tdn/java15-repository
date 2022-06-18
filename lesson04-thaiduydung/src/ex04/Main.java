package ex04;

public class Main {
	public static void main(String[] args) {
		People employee1 = new Employee("Nguyễn Văn A", "22-09-1998", 1, 1, "Marketing");
		People employee2 = new Employee("Nguyễn Văn B", "12-11-1992", 2, 2, "IT");

		People director = new Director("Lê Thị C", "19-03-1986", 2, 4);
		People manager = new Manager("Trần Tiến F", "02-03-1997", 1, 3, 28);
		People[] arr = { employee1, employee2, director, manager };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}
}