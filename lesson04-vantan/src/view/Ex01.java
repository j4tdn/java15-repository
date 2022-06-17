package view;

import bean.Student;

public class Ex01 {
	public static void main(String[] args) {
		Student student1 = new Student("văn tân", 111, 8.7f, 7.7f);
		Student student2 = new Student("bảo đại", 112, 9.7f, 7.9f);

		// hàm khởi tạo rỗng cho sv3
		Student student3 = new Student();
		// gán giá trị cho sv3
		student3.setName("bo la");
		student3.setId(113);
		student3.setPointLT(8.4f);
		student3.setPointTH(9.4f);
		//System.out.println(student3.toString());

		Student[] students = { student1, student2, student3 };
		//tìm  sinh viên có điểm trung bình trên 8.5.
		for (Student student : students) {
			if (student.average() > 8.5) {
				System.out.println(student.toString());
			}
		}
		System.out.println("================");
		// sinh viên có điểm LT cao hơn điểm TH
		for (Student student : students) {
			if( student.getPointLT() > student.getPointTH()) {
				System.out.println(student.toString());
			}
		}
	}

}