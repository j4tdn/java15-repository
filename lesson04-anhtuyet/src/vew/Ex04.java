package vew;

import been.Employee;
import been.Manager;
import been.People;
import been.President;

public class Ex04 {
	public static void main(String[] args) {
		President s1 = new President ("Le Thi Anh Tuyet", "10/02/2001", 3.5f, 1.2f);
		Manager m1 = new Manager("NTH","11/02/2001", 3.5f, 20);
		Employee emp1 = new Employee("VTPL","18/10/2001", 3f,"KHOA CNTT");
		Employee emp2 = new Employee("THK","28/10/2001", 3f,"KHOA CNTT");
		
		People [] aa = {s1, m1, emp1, emp2};
		System.out.println("thong tin nhan su trong con ty: ");
		for(int i = 0; i<aa.length;i++) {
			System.out.println(aa[i]);
		}
		System.out.println("===================");
		for(int i = 0; i< aa.length;i++) {
			System.out.println("Luong cua " + aa[i].getName() + "la: " + aa[i].payRoll());
		}
	}
}
