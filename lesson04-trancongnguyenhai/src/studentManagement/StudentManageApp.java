package studentManagement;

public class StudentManageApp {
	public static void main(String[] args) {
		Student sv1 = new Student(1, "Tran Cong Nguyen Hai", 10f, 9f);
		Student sv2 = new Student(2, "Pham Quang Hai", 7f, 9f);
		Student sv3 = new Student();
		StudentManageUtils.InputStudent(sv3);
		Student[] svs = { sv1, sv2, sv3 };
		System.out.println("===========================================================");
		System.out.println("Students have average higher than 8.5: ");
		for (int i = 0; i < StudentManageUtils.findWithAverageScoreHigherThan8dot5(svs).length; i++) {
			System.out.println(StudentManageUtils.findWithAverageScoreHigherThan8dot5(svs)[i].getFullName());
		}
		System.out.println("===========================================================");
		System.out.println("Students have theory score than practice score: ");
		for (int i = 0; i < StudentManageUtils.findWithTheoryScoreHigherThanPracticeScore(svs).length; i++) {
			System.out.println(StudentManageUtils.findWithTheoryScoreHigherThanPracticeScore(svs)[i].getFullName());
		}
	}
}
