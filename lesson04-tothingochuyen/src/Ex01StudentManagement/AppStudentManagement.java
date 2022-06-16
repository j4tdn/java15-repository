package Ex01StudentManagement;

import java.util.Scanner;

/**
 * Viết chương trình OOP quản lý sinh viên đơn giản: Nhập xuất thông tin, tính điểm TB.
Tạo lớp Sinh viên như sau:
Attributes (private):
Mã sinh viên là số nguyên.
Họ tên: chuỗi ký tự.
Điểm LT, điểm TH : float

Xây dựng class chứa hàm main: tạo 3 đối tượng sinh viên sv1, sv2, sv3, trong đó:
1. sv1 chứa thông tin của chính mình (tạo bằng constructor đủ thông số, thông tin biết rồi
khỏi nhập từ bàn phím).
2. sv2 là thông tin người bạn thân nhất của em (tạo bằng constructor đủ thông số, thông tin
biết rồi khỏi nhập từ bàn phím).
3. sv3 tạo bằng constructor mặc định. Tạo hàm nhập các thông tin cho sv3 từ bàn phím sau
đó dùng setter để gán các thuộc tính tương ứng.
4. Viết hàm tìm thông tin sinh viên có điểm trung bình lớn hơn 8.5
5. Viết hàm tìm thông tin sinh viên có điểm LT lớn hơn điểm TH
 * */
public class AppStudentManagement {
	public static void main(String[] args) {
		Students sv1 = new Students(1, "To Thi Ngoc Huyen", 9, 8.5f);
		System.out.println(sv1);
		System.out.println("====================");
		
		Students sv2 = new Students(2, "Nguyen Thi Bich Vy", 7.5f, 8);
		System.out.println(sv2);
		System.out.println("====================");
		
		System.out.println("Enter student information:");
		Students sv3 = new Students();
		sv3 = StudentUtils.inputInformation();;
		
		System.out.println("=====================");
		Students[] sv = {sv1, sv2, sv3};
		System.out.println("Students with GPA greater than 8.5:");
		StudentUtils.averagePointOver85(sv);
		
		System.out.println("=====================");
		System.out.println("Student with theoretical point better than practice point:");
		StudentUtils.theoreticalPointBetterThanPracticePoint(sv);
	}
	
	
	
}
