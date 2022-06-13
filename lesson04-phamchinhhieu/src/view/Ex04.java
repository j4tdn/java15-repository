package view;

import bean.Employee;
import bean.Manager;
import bean.People;
import bean.President;

public class Ex04 {
	public static void main(String[] args) {

		President ps1 = new President("Pham Chinh Hieu", "09/06/2002", 2.5f, 0.2f);
		Manager mn1 = new Manager("PCH", "06/09/2002", 3.2f, 18);
		Employee emp1 = new Employee("PHC", "12/12/2002", 2.1f, "KHOA CNTT");
		Employee emp2 = new Employee("PHCD", "11/11/2001", 2.2f, "KHOA HOA");

		People[] pp = { ps1, mn1, emp1, emp2 }; //neu so luong nhan vien nhieu thi tao vong for de tao mang
		System.out.println("Thong tin nhan su trong cong ty:");
		for(int i = 0; i < pp.length; i++) {
			System.out.println(pp[i]);
		}
		System.out.println("\n========================\n");
		for(int i = 0; i < pp.length; i++) {
			System.out.println("Luong cua " + pp[i].getName() + " la: " + pp[i].payRoll());
		}
	}

}
