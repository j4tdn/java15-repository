package test;

import java.util.Scanner;

import main.StudentList;
import main.Students;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StudentList stl = new StudentList();
		int choice = 0;
		do {
			System.out.println("MENU ---------- ");
			System.out.println("Vui lòng chọn chức năng: ");
			System.out.println(
			  "1.	Thêm sinh viên vào danh sách.\n"
			+ "2.	In danh sách sinh viên ra màn hình.\n"
			+ "3.	Kiểm tra danh sách có rỗng hay không.\n"
			+ "4.	Lấy ra số lượng sinh viên trong danh sách.\n"
			+ "5.	Làm rỗng danh sách sinh viên.\n"
			+ "6.	Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.\n"
			+ "7.	Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.\n"
			+ "8.	Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.\n"
			+ "9.	Xuất ra danh sách sinh viên có điểm từ cao đến thấp.\n"
			+ "0.   Thoát khỏi chương trình");
			choice = sc.nextInt();
			sc.nextLine();
			if (choice == 1) {
				System.out.println("NHẬP MÃ SINH VIÊN");
				String studentNumber = sc.nextLine();
				System.out.println("NHẬP HỌ VÀ TÊN");
				String name = sc.nextLine();
				System.out.println("NHẬP NĂM SINH");
				int yearOfBirth = sc.nextInt();
				System.out.println("NHẬP ĐIỂM TRUNG BÌNH");
				double average = sc.nextDouble();
				Students st = new Students(studentNumber, name, yearOfBirth, average);
				stl.addStudent(st);
			}else if(choice == 2) {
				stl.getStudentName();
			}else if (choice == 3) {
				System.out.println("rong :"+stl.testEmtry());
			}else if (choice == 4) {
				System.out.println("số lượng: "+stl.getQuantity());
			}else if(choice ==5) {
				stl.removeAllList();
				System.out.println("Danh Sách Được Làm Rỗng");
			}else if(choice ==6) {
				System.out.println("Nhập mã sinnh viên"); String studentNumber = sc.nextLine();
				Students sv = new Students(studentNumber);
				System.out.println("Sinh viên có trong danh sách "+stl.testContains(sv));
			}else if (choice==7) {
				System.out.println("Nhập mã sinh viên"); String studentNumber = sc.nextLine();
				Students sv = new Students(studentNumber);
				System.out.println("xóa sinh viên trong danh sách "+stl.removeStudent(sv));
			}else if (choice == 8) {
				System.out.println("Nhập vào tên"); String name = sc.nextLine();
				System.out.println("Kết quả tìm kiếm");
				stl.findStudent(name);
			}else if (choice ==9) {
				stl.arrangement();
				stl.getStudentName();
			
			}
			
		} while (choice != 0);
	}

}
