package studentmanagement;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Students[] tmp = add();
		Search(tmp);
		SearchLTThanTH(tmp);

	}

	public static Students[] add() {
		Scanner sc = new Scanner(System.in);
		Students sv1 = new Students(102200111, "nguyenquan", 9.0f, 8.2f);

		Students sv2 = new Students(102200678, "nguyenvanthinh", 9.0f, 10.0f);

		System.out.print("Enter MSSV:");
		int MSSV = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter Name:");
		String name = sc.nextLine();

		System.out.print("Enter pointLT:");
		float pointLT = sc.nextFloat();

		System.out.print("Enter PointTH:");
		float pointTH = sc.nextFloat();

		Students sv3 = new Students();
		sv3.setMSSV(MSSV);
		sv3.setName(name);
		sv3.setPointLT(pointLT);
		sv3.setPointTH(pointTH);

		Students[] results = { sv1, sv2, sv3 };
		return results;
	}

	public static void Search(Students[] students) {

		for (int i = 0; i < students.length; i++) {
			if (students[i].pointCenter() > 8.5) {
				System.out.println(students[i]);
			}

		}
	}

	public static void SearchLTThanTH(Students[] students) {
		for (int i = 0; i < students.length; i++) {
			if (students[i].getPointLT() > students[i].getPointTH()) {
				System.out.println(students[i]);
			}
		}

	}
}
