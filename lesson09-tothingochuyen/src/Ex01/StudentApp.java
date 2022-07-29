package Ex01;

/**
 * Trong năm 2021 có N sinh viên khoa CNTT đăng ký học phần cấu trúc dữ liệu. Thông
   tin mỗi sinh viên được lưu trữ tại hệ thống gồm: Mã sinh viên, Họ tên, Xếp loại
   Xếp loại học lực được lưu trong Enum với các giá trị: A, B, C, D, E, F
   Với sinh viên có học lực loại F bắt buộc phải đăng ký học lại.
Student[] students
{
new Student(102, "Nam", C),
new Student(103, "Bảo", F),
new Student(104, "Hoàng", D),
new Student(105, "Nguyên", B),
new Student(107, "Vũ", F),
new Student(109, "Lan", A),
new Student(202, "Đạt", C),
new Student(103, "Bảo", F),
new Student(107, "Vũ", C),
new Student(104, "Hoàng", B)
}

Tìm danh sách sinh viên từng đạt loại A trong năm 2021.
Tìm danh sách sinh viên đã tham gia học lại môn cấu trúc dữ liệu trong năm 2021.
 * */
public class StudentApp {
	public static void main(String[] args) {
		Student[] students = {
				new Student("102", "Nam", AcademicRank.C),
				new Student("103", "Bảo", AcademicRank.F),
				new Student("104", "Hoàng", AcademicRank.D),
				new Student("105", "Nguyên", AcademicRank.B),
				new Student("107", "Vũ", AcademicRank.F),
				new Student("109", "Lan", AcademicRank.A),
				new Student("202", "Đạt", AcademicRank.C),
				new Student("103", "Bảo", AcademicRank.F),
				new Student("107", "Vũ", AcademicRank.C),
				new Student("104", "Hoàng", AcademicRank.B)
		};
		
		getStudentsLevelA(students);
		System.out.println("====================================");
		getStudentsLearnAgain(students);
	}
	
	private static void getStudentsLevelA(Student[] students) {
		for(Student student: students) {
			if(student.getLevel() == AcademicRank.A) {
				System.out.println("List of students who have achieved grade A in 2021: \n" + student);
			}
		}
	}
	
	private static void getStudentsLearnAgain(Student[] students) {
		System.out.println("List of students who have re-learned data structures in 2021: ");
		for(int i = 0; i < students.length; i++) {
			for(int j = i + 1; j < students.length; j++) {
				if(students[i].getId() == students[j].getId()) {
					System.out.println( students[i] + ", re-learned score=" + students[j].getLevel());
				}
			}
		}
	}
}
