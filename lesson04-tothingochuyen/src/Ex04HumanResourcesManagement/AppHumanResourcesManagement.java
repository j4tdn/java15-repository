package Ex04HumanResourcesManagement;

import java.time.LocalDate;

/**
 * Viết chương trình quản lý nhân sự tại công ty A gồm các loại nhân sự sau đây.
a. Giám đốc: họ tên, ngày sinh, hệ số lương, hệ số chức vụ.
b. Trưởng phòng: họ tên, ngày sinh, hệ số lương, số lượng nhân viên quản lý
c. Nhân viên: họ tên, ngày sinh, hệ số lương, tên đơn vị(phòng/ban)
Chương trình thực hiện các công việc sau đây.

Nhập dữ liệu gồm 1 Giám đốc, 1 Trưởng phòng, 2 Nhân viên
Hiển thị thông tin các nhân sự có trong công ty
Tính và in ra mức lương của từng loại nhân sự , biết rằng :
Nhân viên: Lương = (hệ số lương + hệ số chức vụ(nếu có)) * 1250000
Trưởng phòng: Lương = (hệ số lương + hệ số chức vụ(nếu có)) * 2200000
Giám đốc: Lương = (hệ số lương + hệ số chức vụ(nếu có)) * 3000000
 * */
public class AppHumanResourcesManagement {
	public static void main(String[] args) {
		Director d1 = new Director("Nguyen Van A", LocalDate.of(1985, 3, 20), 3.33f, 2.5f);
		Manager m1 = new Manager("Tran Thi Lan", LocalDate.of(1992, 5, 15), 2.95f, 95);
		Staff s1 = new Staff("Nguyen B", LocalDate.of(1995, 6, 22), 2.45f, "Ke toan");
		Staff s2 = new Staff("Nguyen C", LocalDate.of(1997, 3, 13), 2.45f, "Kinh doanh");
		
		System.out.println("Employee's information:");
		System.out.println(d1);
		System.out.println(m1);
		System.out.println(s1);
		System.out.println(s2);
	}
}
