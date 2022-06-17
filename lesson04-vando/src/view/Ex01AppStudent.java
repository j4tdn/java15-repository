package view;

public class Ex01AppStudent {
	public static void main(String[] args) {
		Ex01Students sv1 = new Ex01Students(1, "Nguyen Van Do", 9.5f, 8f);
		System.out.println(sv1);
		System.out.println("====================");
		
		Ex01Students sv2 = new Ex01Students(2, "Tran Dinh khanh", 7, 8.5f);
		System.out.println(sv2);
		System.out.println("====================");
		
		System.out.println("Enter student information:");
		Ex01Students sv3 = new Ex01Students();
		Ex01StudentsUtils.inputStudent(sv3);
		
		System.out.println("=====================");
		Ex01Students[] sv = {sv1, sv2, sv3};
		System.out.println("Students with GPA greater than 8.5:");
		Ex01StudentsUtils.averagePointOver85(sv);
		
		System.out.println("=====================");
		System.out.println("Student with theoretical point better than practice point:");
		Ex01StudentsUtils.PointLTBetterPointTH(sv);
	}
}
