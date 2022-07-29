package ex01;

public class Main {
	public static void main(String[] args) {
		Student[] student ={
				new Student(102, "Nam", Classification.C), 
				new Student(103, "Bảo", Classification.F),
				new Student(104, "Hoàng", Classification.D),
				new Student(105, "Nguyên", Classification.B),
				new Student(107, "Vũ", Classification.F), 
				new Student(109, "Lan", Classification.A),
				new Student(202, "Đạt", Classification.C), 
				new Student(103, "Bảo", Classification.F),
				new Student(107, "Vũ", Classification.C), 
				new Student(104, "Hoàng", Classification.B) 
				
		};
		System.out.println("=======================");

		Student[] classificationStudent = classification(student);
		for (Student s : classificationStudent) {
			if(s!=null) {
			System.out.println("Danh sách sinh viên xếp loại A : " + s);
			}
		}
		
		Student[] againStudents = getStudyAgain(student);
		for (Student s : againStudents) {
			if(s!=null) {
			System.out.println(s);
			}
		}

	
	}
	private static Student[] classification(Student[] students) {
		Student[] s = new Student[students.length];
		int index = 0;
		for (Student student : students) {
			if (student.getClassification() == Classification.A) {
				s[index] = student;
			}
		}
		return s;
	}

	private static Student[] getStudyAgain(Student[] student) {
		Student[] s = new Student[student.length];
		int index = 0;
		for (int i = 0; i < student.length; i++) {
			for (int j = i + 1; j < student.length; j++) {
				if (student[i].getId() == student[j].getId()) {
					s[index] = student[i];
					index++;
				}
			}
		}
		return s;
	}

}