import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		Date date1 = new Date(3, 8, 1991);
		Date date2 = new Date(1, 8, 1991);
		Date date3 = new Date(3, 8, 1991);
		
		Course course1 = new Course("công nghê", "K98");
		Course course2 = new Course("Giáo dục", "k37");
		Course course3 = new Course("Tài Chính", "k50");
		
		StudentManagement studentManagement1 = new StudentManagement("123k79", "Trần Quang Đạo", date1, 8.3, course1);
		StudentManagement studentManagement2 = new StudentManagement("234w09", "Hoàng Thị Diệu Linh", date1, 5.3, course2);
		StudentManagement studentManagement3 = new StudentManagement("237d87", "Đào Đức Đô", date3, 4.5, course3);
		
		
		System.out.println("Course Name 2: "+studentManagement2.takeCourseName());
		  
		System.out.println("Học sinh 3 vượt qua kì thi:"+ studentManagement3.testExam());
		System.out.println("học sinh 2 vượt qua kì thi: "+studentManagement2.testExam());
		
		System.out.println("sinh viên 1 và 3 giống ngày sinh: "+studentManagement2 .testDate(studentManagement3));
		System.out.println("sv 2 và 3: "+studentManagement2.testDate(studentManagement3));
		
		System.out.println(date1);
		System.out.println(course2);
		System.out.println(date1.getDay());
		date1.setMonth(11);
		System.out.println(date1.getMonth());
		StudentManagement[] tds = {studentManagement1, studentManagement2, studentManagement3};
	StudentManagement[] result  = filter(tds);
	for (StudentManagement studentManagement : result) {
		System.out.println(studentManagement);
	}
	
	}
	public static StudentManagement[] filter(StudentManagement[] studentManagements) {
		StudentManagement[] result = new StudentManagement[studentManagements.length];
		int count = 0;
		for (StudentManagement studentManagement : studentManagements) {
			if(studentManagement.average > 5) {
				result[count] = studentManagement;
				count++;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}


}
