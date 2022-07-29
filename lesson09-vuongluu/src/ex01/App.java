package ex01;

public class App {
	public static void main(String[] args) {
		Student[] students=
		{
		new Student(102, "Nam", Classification.C),
		new Student(103, "Bảo", Classification.F),
		new Student(104, "Hoàng", Classification.C),
		new Student(105, "Nguyên", Classification.B),
		new Student(107, "Vũ", Classification.F),
		new Student(109, "Lan", Classification.A),
		new Student(202, "Đạt", Classification.C),
		new Student(103, "Bảo", Classification.F),
		new Student(107, "Vũ", Classification.C),
		new Student(104, "Hoàng", Classification.B)
		};
		System.out.println("Sinh viên đạt A trong năm 2021");
		for(Student student:students) {
			if(student.getClassification()==Classification.A) {
				System.out.println(student);
			}
		}
		System.out.println("=========================");
		System.out.println("Sinh viên đạt F trong năm 2021");
		for(Student student:students) {
		if(student.getClassification()==Classification.F) {
			System.out.println(student);
		}
		}
	}
}
